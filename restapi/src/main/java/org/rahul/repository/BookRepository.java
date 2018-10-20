package org.rahul.repository;

import java.util.List;

import org.rahul.model.Book;

public interface BookRepository {
	
	public List<Book> getAllBooks();

	public Book getBookById(int bookId);
}
