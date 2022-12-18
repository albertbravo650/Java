package com.albertbravo.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertbravo.bookclub.models.Book;
import com.albertbravo.bookclub.models.User;
import com.albertbravo.bookclub.services.BookService;
import com.albertbravo.bookclub.services.UserService;



@Controller
public class SecondController {
	
	@Autowired
	UserService userServ;
	
	@Autowired
	BookService bookServ;
	
	// show one book
	@GetMapping("/books/{id}")
	public String showOneBook(Model model, @PathVariable("id") Long id) {
		Book book = bookServ.findBook(id);
		model.addAttribute("book", book);
		return "show.jsp";
	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("book") Book book, Model viewModel,
			HttpSession session) {
		// if not logged in get sent back
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		User loggedUser = userServ.findById((Long) session.getAttribute("userId"));
		viewModel.addAttribute("loggedUser", loggedUser);
		return "add.jsp";
	}
	
	@PostMapping("/books/add")
	public String add(
			@Valid @ModelAttribute("book") Book book,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		else {
			bookServ.createBook(book);
			return "redirect:/books";
		}
	}
			
//	@GetMapping("/expenses/{id}/edit")
//	public String edit(@PathVariable("id") Long id, Model model) {
//		Expense expense = expenseService.findExpense(id);
//		model.addAttribute("expense", expense);
//		return "edit.jsp";
//	}
//		
//	@PutMapping("/expenses/{id}")
//	public String update(
//			@Valid @ModelAttribute("expense") Expense expense,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "edit.jsp";
//		}
//		else {
//			expenseService.updateExpense(expense);
//			return "redirect:/expenses";
//		}
//	}
//			
//	@DeleteMapping("/expenses/{id}/delete")
//	public String destroy(@PathVariable("id") Long id) {
//		expenseService.deleteExpense(id);
//		return "redirect:/expenses";
//	}
}
