package com.albertbravo.ninjagoldgame.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/")
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
			@RequestParam(value="caveGold", required=false) Integer caveGold,
			@RequestParam(value="houseGold", required=false) Integer houseGold,
			@RequestParam(value="questGold", required=false) Integer questGold
			) {
		Integer gold = (Integer) session.getAttribute("gold");
		session.setAttribute("gold", farmGold + gold);
		return "redirect:/";
	}

}
