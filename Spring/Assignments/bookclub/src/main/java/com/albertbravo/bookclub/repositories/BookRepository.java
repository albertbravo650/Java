package com.albertbravo.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.albertbravo.bookclub.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
