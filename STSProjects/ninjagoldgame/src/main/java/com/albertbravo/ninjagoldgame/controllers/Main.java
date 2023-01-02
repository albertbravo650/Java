package com.albertbravo.ninjagoldgame.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		else {
			Integer gold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", gold);
		}
		return "index.jsp";
	}
	
	@PostMapping("/action")
	public String action(
			HttpSession session,
			@RequestParam(value="farmGold", required=false) Integer farmGold,
			@RequestParam(value="caveGold", required=false) Integer caveGold
			) {
		Integer gold = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", farmGold + gold);
		return "redirect:/";
	}

}
