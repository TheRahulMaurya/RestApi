package org.rahul.repository;

import java.util.ArrayList;
import java.util.List;

import org.rahul.model.Book;

public class BookRepositoryImpl implements BookRepository{
	List<Book> bookList ;
	
	
	
	
	public BookRepositoryImpl()
	{
		bookList = new ArrayList<Book>();
		Book b1 = new Book(101,"c","Denis Ritchie",324);
		Book b2 = new Book(102,"c++","James Gosling",354);
		
		
		bookList.add(b1);
		bookList.add(b2);
	}


	@Override
	public List<Book> getAllBooks() {
		
		return bookList;
	}


	@Override
	public Book getBookById(int bookId) {
		Book book=null;
		for(Book b : bookList )
		{
			if(b.getBookId() == bookId)
				book = b;
		}
		
		return book;
	}
	
	
}
