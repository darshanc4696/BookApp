package com.book.BookApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "authordetails")
public class AuthorDetails {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "booktitle")
	private String bookTitle;
	
	public AuthorDetails() {
		super();
	}

	public AuthorDetails(int id, String name, String bookTitle) {
		super();
		this.id = id;
		this.name = name;
		this.bookTitle = bookTitle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "AuthorDetails [id=" + id + ", name=" + name + ", bookTitle=" + bookTitle + "]";
	}

}
