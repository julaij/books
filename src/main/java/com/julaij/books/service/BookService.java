package com.julaij.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.julaij.books.model.Book;
import com.julaij.books.repository.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepository;

    @Autowired //dependency injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

	public void createBook(Book book) {
		// TODO Auto-generated method stub
			bookRepository.save(book);
			
	}

	public Book findBookByIsbn(Long isbn) {
		// TODO Auto-generated method stub
		return bookRepository.findById(isbn).get();
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public void updateBookByBookId(Long bookId, Book book) {
		// TODO Auto-generated method stub
		
		//asking the database for the book to update
		Book bookToUpdate = bookRepository.findById(bookId).get();
		
		bookToUpdate.setIsbn(book.getIsbn());
		bookToUpdate.setPrice(book.getPrice());
		bookToUpdate.setFree(book.isFree());
		bookToUpdate.setTitle(book.getTitle());
		
		bookRepository.save(bookToUpdate);	
		
		
	}

	public void deleteBookByBookId(Long bookId) {
		// TODO Auto-generated method stub
		
		bookRepository.deleteById(bookId);
		
	}
	
	
	

}
