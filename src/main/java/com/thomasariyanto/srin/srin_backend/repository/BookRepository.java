package com.thomasariyanto.srin.srin_backend.repository;

import com.thomasariyanto.srin.srin_backend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}