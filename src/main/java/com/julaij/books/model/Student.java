package com.julaij.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "student")

public class Student {
	@Id
	
	private Long studentId;
	
	private String studentName;
	
	private String emailId;
	
	private String major;
	
	private Long bookId;
	
	public Student() {
		
	}

	public Student(Long studentId, String studentName, String emailId, String major, Long bookId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
		this.major = major;
		this.bookId = bookId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	

	
	
	

}
