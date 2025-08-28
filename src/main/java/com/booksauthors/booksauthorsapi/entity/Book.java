package com.booksauthors.booksauthorsapi.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id @GeneratedValue
    private Long id;
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
