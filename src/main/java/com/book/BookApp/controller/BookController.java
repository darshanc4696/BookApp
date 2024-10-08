package com.book.BookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.book.BookApp.entity.AuthorDetails;
import com.book.BookApp.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bs;

	@GetMapping("/getallauthors")
	List<AuthorDetails> sending()
	{
		return bs.getAllAuthors();
	}
	
	@GetMapping("/getbyid/{id}")
	AuthorDetails getById(@PathVariable("id") int aid)
	{
		return bs.getById(aid);
	}

}
