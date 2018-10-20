package org.rahul.restapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
	
	
	 @GET
	 @Produces(MediaType.APPLICATION_XML)
	 public List<Book> getAllBooks()
	 {
	    return bookRepo.getAllBooks();
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
}
