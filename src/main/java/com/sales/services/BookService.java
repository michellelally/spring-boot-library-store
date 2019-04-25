package com.sales.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.models.Book;
import com.sales.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository br;
	
	public Iterable<Book> getBooks() {
		// System.out.println("Hello from getCustomers in CustomerService");
		// Passing call onto CustomerRepository
		return br.findAll(); 
	}
	
	public void save(Book b) {
		br.save(b);
	}

}
