package com.thomasariyanto.srin.srin_backend.repository;

import com.thomasariyanto.srin.srin_backend.model.Borrowing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
    @Query("SELECT b FROM Borrowing b WHERE LOWER(b.book.title) LIKE %:search% OR LOWER(b.member.name) LIKE %:search% OR STR(b.borrowDate) LIKE %:search%")
    List<Borrowing> findBySearch(@Param("search") String search);
}
