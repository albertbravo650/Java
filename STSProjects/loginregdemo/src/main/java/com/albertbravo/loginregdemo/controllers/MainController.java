package com.albertbravo.loginregdemo.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertbravo.loginregdemo.models.LoginUser;
import com.albertbravo.loginregdemo.models.User;
import com.albertbravo.loginregdemo.services.UserService;

@Controller
public class MainController {
	// Service Link
	@Autowired
	private UserService userServ;
	
	@GetMapping("/")
	public String loginRegPage(@ModelAttribute("registerUser") User newUser,
			@ModelAttribute("loginUser") LoginUser loginUser) {
		return "loginreg.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model viewModel) {
		Long userId = (Long) session.getAttribute("userId");
		viewModel.addAttribute("loggedUser", userServ.findById(userId));
		return "dashboard.jsp";
	}
	
	@PostMapping("/register")
	public String registerUser(@Valid @ModelAttribute("registerUser") User newUser, BindingResult result,
			HttpSession session) {
		User changedUser = userServ.register(newUser, result);
		if(result.hasErrors()) {
			return "loginreg.jsp";
		}
		else {
			session.setAttribute("userId", changedUser.getId());
			return "redirect:/dashboard";
		}
	}
	
	@PostMapping("/login")
	public String loginUser() {
		return null;
	}
	
	// Logout by clearing session and returning to loginreg page
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}
