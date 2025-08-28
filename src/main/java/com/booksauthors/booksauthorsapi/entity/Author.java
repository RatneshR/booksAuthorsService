package com.booksauthors.booksauthorsapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;

}
