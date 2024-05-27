package com.julaij.books.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	//Book is a POJO (Plain Old Java Object)
	
	@Id // primary key
	private Long isbn;
	
	private String title;
	
	private double price;
	
	private boolean isFree;
	
	public Book() {
		
	}
	
	public Book(long isbn, String title, double price, boolean isFree) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.isFree = isFree;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}
	
	
	
	

}

