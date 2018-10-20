package org.rahul.model;

import java.util.Date;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private int pages;
	private Date created;
	
	//Constructor
	
	public Book(int bookId, String title, String author, int pages) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.pages = pages;
		created = new Date();
	}
	
	

	
}
