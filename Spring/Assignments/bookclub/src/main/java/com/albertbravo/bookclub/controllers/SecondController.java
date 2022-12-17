package com.albertbravo.bookclub.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.albertbravo.bookclub.models.Book;
import com.albertbravo.bookclub.services.BookService;
import com.albertbravo.bookclub.services.UserService;



@Controller
public class SecondController {
	
	@Autowired
	UserService userServ;
	
	@Autowired
	BookService bookServ;
	
	// show one book
//	@GetMapping("/expenses/{id}")
//	public String showOneExpense(Model model, @PathVariable("id") Long id) {
//		Expense expense = expenseService.findExpense(id);
//		model.addAttribute("expense", expense);
//		return "show.jsp";
//	}
	
	@GetMapping("/books/new")
	public String newBook(@ModelAttribute("newBook") Book book, Model viewModel,
			HttpSession session) {
		// if not logged in get sent back
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		return "add.jsp";
	}
	
//	@PostMapping("/expenses")
//	public String create(
//			@Valid @ModelAttribute("expense") Expense expense,
//			BindingResult result, Model model) {
//		List<Expense> expenses = expenseService.allExpenses();
//		model.addAttribute("expenses", expenses);
//		if(result.hasErrors()) {
//			return "index.jsp";
//		}
//		else {
//			expenseService.createExpense(expense);
//			return "redirect:/expenses";
//		}
//	}
			
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
