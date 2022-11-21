package com.albertbravo.mvcdemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

import com.albertbravo.mvcdemo.models.Book;
import com.albertbravo.mvcdemo.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public String home(Model model) {
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		return "index.jsp";
	}
	
	// show one book
	@GetMapping("/books/{bookId}")
	public String showOneBook(Model model, @PathVariable("bookId") Long bookId) {
		Book book = bookService.findBook(bookId);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book) {
		return "new.jsp";
	}
	
	@PostMapping("/books/create")
	public String create(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result) {
		if(result.hasErrors()) {
			return "new.jsp";
		}
		else {
			bookService.createBook(book);
			return "redirect:/books";
		}
	}
	
	@GetMapping("/books/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		return "edit.jsp";
	}
	
	@PutMapping("/books/{id}")
	public String update(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			bookService.updateBook(book);
			return "redirect:/books";
		}
	}
	
	@DeleteMapping("/books/{id}")
	public String destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
		return "redirect:/books";
	}

}
