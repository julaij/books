package com.julaij.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julaij.books.model.Student;
import com.julaij.books.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
		
	}

	public Student findStudentByStudentId(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).get();
	}

	public void createStudent(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		
	}
	
	public void updateStudentByStudentId(Long studentId, Student student) {
		Student studentToUpdate = studentRepository.findById(studentId).get();
		
		studentToUpdate.setStudentId(student.getStudentId());
		studentToUpdate.setStudentName(student.getStudentName());
		studentToUpdate.setEmailId(student.getEmailId());
		studentToUpdate.setMajor(student.getMajor());
		studentToUpdate.setBookId(student.getBookId());
		
		studentRepository.save(studentToUpdate);
		

	}

	public void deleteStudentByStudentId(Long studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
	}

	
	
	
	
}
