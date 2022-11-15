package com.albertbravo.thursdayweek3demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@GetMapping("/")
	public String homePage() {
		return "home.jsp";
	}
	
	@PostMapping("/processform")
	public String handleForm(
			@RequestParam(value="username") String username,
			@RequestParam(value="email") String emailFromForm,
			@RequestParam(value="age") String age,
			@RequestParam(value="password") String password,
			HttpSession session, RedirectAttributes flashAttributes) {
		boolean isValid = true;
		if(username.length() < 3) {
			flashAttributes.addFlashAttribute("usernameMessage", "User name must be 3 characters");
			isValid = false;
		}
		if(!isValid) {
			return "redirect:/";
		}
		session.setAttribute("name", username);
		
		return "redirect:/results";
	}
	
	@GetMapping("/results")
	public String resultsPage(Model viewModel, HttpSession session) {
		viewModel.addAttribute("username", (String) session.getAttribute("name"));
		
		return "output.jsp";
	}

}
