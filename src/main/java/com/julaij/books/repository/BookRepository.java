package com.julaij.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.julaij.books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	

}
