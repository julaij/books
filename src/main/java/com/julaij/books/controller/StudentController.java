package com.julaij.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julaij.books.model.Student;
import com.julaij.books.service.StudentService;

@RestController
@RequestMapping("/api/v1/student/")
@CrossOrigin(origins="*")
public class StudentController {
	
	@Autowired //dependency Injection
	private StudentService studentService;

	@GetMapping("hello")
	public String sayHello() {
		return "hello student";
	}
	
	@GetMapping("students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
		
	}
	
	@GetMapping("/{studentId}")
	public ResponseEntity<Student> findStudentByStudentId(@PathVariable Long studentId){
		Student student = studentService.findStudentByStudentId(studentId);
		return ResponseEntity.ok(student);
		
	}
	
	@PostMapping("students")
	public ResponseEntity createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
		return ResponseEntity.status(HttpStatus.CREATED).body(student);
	}
	
	@PutMapping("/{studentId}")
	public ResponseEntity updateStudentByStudentId(@PathVariable Long studentId, @RequestBody Student student) {
		studentService.updateStudentByStudentId(studentId, student);
		return ResponseEntity.status(HttpStatus.CREATED).body(student);
	}

	@DeleteMapping("/{studentId}")
	public ResponseEntity deleteStudentByStudentId(@PathVariable Long studentId) {
		studentService.deleteStudentByStudentId(studentId);
		return ResponseEntity.status(HttpStatus.OK).body("Student with" + studentId + "Deleted");
	}
	








}


