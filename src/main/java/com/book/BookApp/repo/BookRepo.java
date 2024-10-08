package com.book.BookApp.repo;

import org.springframework.data.repository.CrudRepository;

import com.book.BookApp.entity.AuthorDetails;


public interface BookRepo extends CrudRepository<AuthorDetails, Integer>{

	AuthorDetails findAllById(int aid);

}
