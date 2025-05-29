package com.thomasariyanto.srin.srin_backend.controller;

import com.thomasariyanto.srin.srin_backend.model.Member;
import com.thomasariyanto.srin.srin_backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api/members")
@CrossOrigin
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping
    public List<Member> readAll() {
        return memberRepository.findAll();
    }

    @GetMapping("/{id}")
    public Member read(@PathVariable Long id) {
        return memberRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Member create(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @PutMapping("/{id}")
    public Member update(@PathVariable Long id, @RequestBody Member updated) {
        updated.setId(id);
        return memberRepository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        memberRepository.deleteById(id);
    }
}
