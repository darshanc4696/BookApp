package com.book.BookApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.BookApp.entity.AuthorDetails;
import com.book.BookApp.repo.BookRepo;

@Component
public class BookService {
	
	@Autowired
	BookRepo br;

	public List<AuthorDetails> getAllAuthors() {
		
		return (List<AuthorDetails>) br.findAll();
	}

	public AuthorDetails getById(int aid) {
		
		return br.findAllById(aid);
	}
	
}
