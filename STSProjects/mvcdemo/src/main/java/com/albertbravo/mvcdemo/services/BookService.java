package com.albertbravo.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.mvcdemo.models.Book;
import com.albertbravo.mvcdemo.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// returns all books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}
	
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}
	
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}
	
	public Book updateBook(Book changedBook) {
		return bookRepository.save(changedBook);
	}
		
	//Delete a book
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
