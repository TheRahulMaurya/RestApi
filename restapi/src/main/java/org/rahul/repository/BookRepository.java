package org.rahul.repository;

import java.util.List;

import org.rahul.model.Book;

public interface BookRepository {
	
	List<Book> getAllBooks();

	Book getBookById(int bookId);
	
	void save(Book book);

	void update(Book book);
}
