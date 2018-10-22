package org.rahul.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {

	private int bookId;
	private String title;
	private String author;
	private int pages;
	private Date created;
	
	//Constructor
	
	public Book() {}
	
	public Book(int bookId, String title, String author, int pages) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.pages = pages;
		created = new Date();
		
	}
	
	
	//Getters And Setters

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", pages=" + pages + ", created="
				+ created + "]";
	}
	
	
	
	
	

	
}
