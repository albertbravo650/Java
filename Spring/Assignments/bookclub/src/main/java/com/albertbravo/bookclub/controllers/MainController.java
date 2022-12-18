package com.albertbravo.bookclub.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertbravo.bookclub.models.Book;
import com.albertbravo.bookclub.models.LoginUser;
import com.albertbravo.bookclub.models.User;
import com.albertbravo.bookclub.services.BookService;
import com.albertbravo.bookclub.services.UserService;

@Controller
public class MainController {
 
	// Add once service is implemented:
	@Autowired
	private UserService userServ;
	
	@Autowired
	private BookService bookServ;
 
	@GetMapping("/")
	public String index(@ModelAttribute("newUser") User newUser,
			@ModelAttribute("loginUser") LoginUser loginUser) {
		return "login.jsp";
	}
	 
	@GetMapping("/books")
	public String books(HttpSession session, Model viewModel) {
		// if not logged in get sent back
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		List<Book> books = bookServ.allBooks();
		viewModel.addAttribute("books", books);
		Long userId = (Long) session.getAttribute("userId");
		viewModel.addAttribute("loggedUser", userServ.findById(userId));
		System.out.println();
		return "home.jsp";
	}
 
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, 
	        BindingResult result, Model model, HttpSession session) {
		User changedUser = userServ.register(newUser, result);
	    if(result.hasErrors()) {
	         // Be sure to send in the empty LoginUser before 
	         // re-rendering the page.
	        model.addAttribute("loginUser", new LoginUser());
	        return "login.jsp";
	    }
	    session.setAttribute("userId", changedUser.getId());
	    return "redirect:/books";
	}
 
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, 
	        BindingResult result, Model model, HttpSession session) {
		User loggedInUser = userServ.login(loginUser, result);
	    if(result.hasErrors()) {
	        model.addAttribute("newUser", new User());
	        return "login.jsp";
	    }
	     // No errors! 
	     // TO-DO Later: Store their ID from the DB in session, 
	     // in other words, log them in.
	    session.setAttribute("userId", loggedInUser.getId());
	    return "redirect:/books";
	}
	 
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
 
}
