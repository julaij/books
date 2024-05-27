package com.julaij.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "author")
public class Author {
	
	@Id
	private Long authorId;
	
	private String firstName;
	
	private int phoneNumber;
	
	private String genre;
	
	public Author() {
		
	}

	public Author(Long authorId, String firstName, int phoneNumber, String genre) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.genre = genre;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	

}
