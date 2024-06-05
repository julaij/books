package com.julaij.books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.julaij.books.model.Book;
import com.julaij.books.service.BookService;

@RestController //controller for REST API
@RequestMapping("/api/v1/book/") //v1 for versioning API
@CrossOrigin(origins = "*") //only allow the frontend URL, not everything in production
public class BookController {
	
	@Autowired
	private BookService bookService;

	//hello world GET API for testing
    @GetMapping("hello") // This is a GET     REST API
    public String sayHello(){
        return "Hello World";

    }
    
    @GetMapping("/{isbn}") //get by id
    public ResponseEntity<Book> findBookByIsbn(@PathVariable Long isbn) {
    	Book book = bookService.findBookByIsbn(isbn);    
        return ResponseEntity.ok(book);
    }  
    
    @GetMapping("books")
    public List<Book> getAllBooks(){
    	return bookService.getAllBooks();
    }
    
    
    @PostMapping("books") //This is a POST 		REST API
    public ResponseEntity createBook(@RequestBody Book book) {
    	bookService.createBook(book);
    	return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
    
    @PutMapping("/{bookId}")
    public ResponseEntity updateBookByBookId(@PathVariable Long bookId, @RequestBody Book book) {
    	bookService.updateBookByBookId(bookId, book);    
    	return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
    
    @DeleteMapping("/{bookId}")
    public ResponseEntity deleteBookByBookId(@PathVariable Long bookId) {
    	bookService.deleteBookByBookId(bookId);
    	return ResponseEntity.status(HttpStatus.OK).body("Book with " + bookId + " deleted");
    }



}
