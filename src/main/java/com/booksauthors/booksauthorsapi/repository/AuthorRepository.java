package com.booksauthors.booksauthorsapi.repository;

import com.booksauthors.booksauthorsapi.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
