package com.julaij.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julaij.books.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
}