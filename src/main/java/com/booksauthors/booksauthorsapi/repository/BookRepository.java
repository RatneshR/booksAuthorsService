package com.booksauthors.booksauthorsapi.repository;

import com.booksauthors.booksauthorsapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
