package com.sales.repositories;

import org.springframework.stereotype.Repository;
import com.sales.models.Book;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	

}
