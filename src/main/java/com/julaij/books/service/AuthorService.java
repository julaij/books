package com.julaij.books.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julaij.books.model.Author;
import com.julaij.books.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;

	public void createAuthor(Author author) {
		// TODO Auto-generated method stub
		authorRepository.save(author);
	}

	public Author findAuthorByAuthorId(Long authorId) {
		// TODO Auto-generated method stub
	    return authorRepository.findById(authorId).get();
	}

	public List<Author> findAllAuthors() {
		// TODO Auto-generated method stub
		return authorRepository.findAll();
		
		
	}

	public void updateAuthorByauthorId(Long authorId, Author author) {
		// TODO Auto-generated method stub
		
		Author authorToUpdate = authorRepository.findById(authorId).get();
		
		authorToUpdate.setAuthorId(author.getAuthorId());
		authorToUpdate.setFirstName(author.getFirstName());
		authorToUpdate.setGenre(author.getGenre());
		authorToUpdate.setPhoneNumber(author.getPhoneNumber());
		
		authorRepository.save(authorToUpdate);	
		
		
	}
	
    public void	deleteAuthorByAuthorId(Long authorId) {
    	authorRepository.deleteById(authorId);
    }
	
	

}
