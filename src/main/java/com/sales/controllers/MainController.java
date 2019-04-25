package com.sales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sales.models.Book;
import com.sales.services.BookService;

@Controller
public class MainController {
	
	@Autowired
	BookService bs;
	
	  @RequestMapping(value = "/addBook", method=RequestMethod.GET)
	  public String addBook(Model m) {
		  Book book = new Book();
		  m.addAttribute("book", book);
		  System.out.println("Book Title: " + book.getTitle());
	    return "addBook";
	  }
	  
	  @RequestMapping(value = "/addBook", method=RequestMethod.POST)
	  public String addBookPOST(@ModelAttribute ("book") Book book) {
		  System.out.println("Book Name: " + book.getTitle());
	    return "redirect:showBook";
	  }
	  
	  

		@RequestMapping(value = "/showBook")
		public String getCustomers(Model m) {
			//System.out.println("Hello from get customers");
			List<Book> books = (List<Book>) bs.getBooks();
			m.addAttribute("books", books);
			
			System.out.println(books.size());
			
			return "showBook";
		}

}
