package com.albertbravo.ninjagoldgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

}
