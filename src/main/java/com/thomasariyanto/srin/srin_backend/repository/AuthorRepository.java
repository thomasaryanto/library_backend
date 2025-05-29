package com.thomasariyanto.srin.srin_backend.repository;

import com.thomasariyanto.srin.srin_backend.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
