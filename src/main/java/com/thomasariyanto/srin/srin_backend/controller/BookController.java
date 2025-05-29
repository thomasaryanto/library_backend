package com.thomasariyanto.srin.srin_backend.controller;

import com.thomasariyanto.srin.srin_backend.model.Book;
import com.thomasariyanto.srin.srin_backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api/books")
@CrossOrigin
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book read(@PathVariable Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book updated) {
        updated.setId(id);
        return bookRepository.save(updated);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
