package com.albertbravo.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertbravo.authentication.models.LoginUser;
import com.albertbravo.authentication.models.User;
import com.albertbravo.authentication.services.UserService;

@Controller
public class HomeController {
 
	// Add once service is implemented:
	@Autowired
	private UserService userServ;
 
	@GetMapping("/")
	public String index(@ModelAttribute("newUser") User newUser,
			@ModelAttribute("loginUser") LoginUser loginUser) {
		return "loginReg.jsp";
	}
	 
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model viewModel) {
		// if not logged in get sent back
		if(session.getAttribute("userId") == null) {
			return "redirect:/";
		}
		Long userId = (Long) session.getAttribute("userId");
		viewModel.addAttribute("loggedUser", userServ.findById(userId));
		return "dash.jsp";
	}
 
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("newUser") User newUser, 
	        BindingResult result, Model model, HttpSession session) {
		User changedUser = userServ.register(newUser, result);
	    if(result.hasErrors()) {
	         // Be sure to send in the empty LoginUser before 
	         // re-rendering the page.
	        model.addAttribute("loginUser", new LoginUser());
	        return "loginReg.jsp";
	    }
	    session.setAttribute("userId", changedUser.getId());
	    return "redirect:/dashboard";
	}
 
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginUser") LoginUser loginUser, 
	        BindingResult result, Model model, HttpSession session) {
		User loggedInUser = userServ.login(loginUser, result);
	    if(result.hasErrors()) {
	        model.addAttribute("newUser", new User());
	        return "loginReg.jsp";
	    }
	     // No errors! 
	     // TO-DO Later: Store their ID from the DB in session, 
	     // in other words, log them in.
	    session.setAttribute("userId", loggedInUser.getId());
	    return "redirect:/dashboard";
	}
	 
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
 
}

