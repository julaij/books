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

import com.julaij.books.model.Author;
import com.julaij.books.service.AuthorService;

@RestController //automatically serilaizes and deserializes java pojo to json object
@RequestMapping("api/v1/author/")
@CrossOrigin(origins = "*")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("hello")
	public String sayHello() {
		return "hello author";
	}
	
	@GetMapping("/{authorId}")
	public ResponseEntity<Author> findAuthorByAuthorId(@PathVariable Long authorId){
		Author author = authorService.findAuthorByAuthorId(authorId);
		return ResponseEntity.ok(author);
	}
	
	
	@PostMapping("authors")
	public ResponseEntity createAuthor(@RequestBody Author author) {
		authorService.createAuthor(author);
		return ResponseEntity.status(HttpStatus.CREATED).body(author);
	}
	
	@GetMapping("authors")
	public List<Author> findAllAuthors(){
	 return	authorService.findAllAuthors();
	}
	
	@PutMapping("/{authorId}")
	public ResponseEntity updateAuthorByAuthorId(@PathVariable Long authorId, @RequestBody Author author) {
		authorService.updateAuthorByauthorId(authorId, author);
		return ResponseEntity.status(HttpStatus.CREATED).body(author);
	}
	
	@DeleteMapping("/{authorId}")
	public ResponseEntity deleteAuthorByAuthorId(@PathVariable Long authorId){
		authorService.deleteAuthorByAuthorId(authorId);
		return ResponseEntity.status(HttpStatus.OK).body("AUTHOR WITH ID " + authorId + " DELETED");
	}
	
}
