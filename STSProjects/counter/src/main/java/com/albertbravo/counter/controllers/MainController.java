package com.albertbravo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/your_server")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@GetMapping("/your_server")
	public String counter(HttpSession session) {
		return "counter.jsp";
	}

}
