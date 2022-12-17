package com.albertbravo.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.bookclub.models.Book;
import com.albertbravo.bookclub.repositories.BookRepository;



@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	
	// returns all Books
	public List<Book> allBooks() {
		return bookRepo.findAll();
	}
	
	// create a Book
	public Book createBook(Book b) {
		return bookRepo.save(b);
	}
	
	public Book findBook(Long bookId) {
		Optional<Book> optionalBook = bookRepo.findById(bookId);
		if(optionalBook.isPresent()) {
			return optionalBook.get();
		}
		else {
			return null;
		}
	}
	
	public Book updateBook(Book changedBook) {
		return bookRepo.save(changedBook);
	}
		
	//Delete a book
	public void deleteBook(Long bookId) {
		bookRepo.deleteById(bookId);
	}
}
