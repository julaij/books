package com.julaij.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julaij.books.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
