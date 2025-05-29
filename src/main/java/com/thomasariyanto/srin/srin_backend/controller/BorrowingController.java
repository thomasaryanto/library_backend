package com.thomasariyanto.srin.srin_backend.controller;

import com.thomasariyanto.srin.srin_backend.model.Borrowing;
import com.thomasariyanto.srin.srin_backend.repository.BorrowingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/rest-api/borrow")
@CrossOrigin
public class BorrowingController {

    @Autowired
    private BorrowingRepository borrowingRepository;

    @GetMapping
    public List<Borrowing> getAll(@RequestParam(required = false) String search) {
        if (search != null && !search.isEmpty()) {
            return borrowingRepository.findBySearch(search.toLowerCase());
        }
        return borrowingRepository.findAll();
    }

    @PostMapping
    public Borrowing create(@RequestBody Borrowing Borrowing) {
        return borrowingRepository.save(Borrowing);
    }

    @PutMapping("/{id}")
    public Borrowing update(@PathVariable Long id, @RequestBody Borrowing updated) {
        updated.setId(id);
        return borrowingRepository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        borrowingRepository.deleteById(id);
    }
}
