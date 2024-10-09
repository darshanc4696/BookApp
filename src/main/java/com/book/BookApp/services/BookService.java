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

	public String insertauthor(AuthorDetails ad) {
		br.save(ad);
		return "successfully Added";
	}

	public String deleteauthor(int aid) {
		
		br.delete(br.findAllById(aid));
		return "Successfully deleted";
	}

	public String updateauthor(int aid, AuthorDetails a) {
		AuthorDetails ad = br.findAllById(aid);
		
		if(ad != null)
		{
			br.save(a);
			return "Succesfully Updated!";
		}
		return "Not Successfull";
	}

	
}
