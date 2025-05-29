package com.thomasariyanto.srin.srin_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String category;
    private int publishingYear;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}