package org.rahul.restapi;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.rahul.model.Book;
import org.rahul.repository.BookRepository;
import org.rahul.repository.BookRepositoryImpl;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("book/")
public class MyResource {
	
	BookRepository bookRepo = new BookRepositoryImpl();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	
//	 @GET
//	 @Produces(MediaType.TEXT_PLAIN)
//	 public String getBook()
//	 {
//	    return "hello";
//	 }
	
	
//	 @GET
//	 @Produces(MediaType.APPLICATION_XML)
//	 public List<Book> getAllBooksXML()
//	 {
//	    return bookRepo.getAllBooks();
//	 }       
	
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	 public List<Book> getAllBooksJSON()
	 {
	    return bookRepo.getAllBooks();
	 }
	 
	 
	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public List<Book> saveBookJSON(Book book)
	 {
		 System.out.println("----------hello");
		bookRepo.save(book);
	    return bookRepo.getAllBooks();
	 }
	 
	 @GET
	 @Path("/{bookId}")
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Book getBookByIdJSON(@PathParam ("bookId") int bookId)
	 {
	    return bookRepo.getBookById(bookId);
	 }
	 
	 
	 
	 
	 

    
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getItJSON() {
//        return "{\"name\" :\"Got it!\"}";
//    }
//    
//  @GET
//  @Produces(MediaType.APPLICATION_XML)
//  public String getItXML() {
//      return "<name>Got it!</name>";
//  }
	 
	 
	 
	 @PUT  								//update
	 @Path("/{bookId}")
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public List<Book> updateBook(@PathParam("bookId") int bookId,Book book)
	 {
//		 System.out.println("Book is ------"+book);
//		 System.out.println("Book id is ------"+bookId);
		 book.setBookId(bookId);
		 
		 bookRepo.update(book);
		 return bookRepo.getAllBooks();
	 }
}
