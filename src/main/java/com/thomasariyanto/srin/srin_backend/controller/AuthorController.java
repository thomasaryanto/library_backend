package com.thomasariyanto.srin.srin_backend.controller;

import com.thomasariyanto.srin.srin_backend.model.Author;
import com.thomasariyanto.srin.srin_backend.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api/authors")
@CrossOrigin
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> readAll() {
        return authorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Author read(@PathVariable Long id) {
        return authorRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Author create(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @PutMapping("/{id}")
    public Author update(@PathVariable Long id, @RequestBody Author updated) {
        updated.setId(id);
        return authorRepository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorRepository.deleteById(id);
    }
}

