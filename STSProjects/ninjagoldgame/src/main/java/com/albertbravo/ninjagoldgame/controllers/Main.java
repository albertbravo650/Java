package com.albertbravo.ninjagoldgame.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	
//	@SuppressWarnings("unchecked")
	@RequestMapping("/")
	public String index(HttpSession session) {
		int gold = 0;
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", gold);
		}
		else {
			gold = (int) session.getAttribute("gold");
		}
		return "index.jsp";
	}
	
	@RequestMapping("/action")
	public String action(
			HttpSession session,
			@RequestParam(value="farmGold", required=false) String farmGold,
			@RequestParam(value="caveGold", required=false) String caveGold,
			@RequestParam(value="houseGold", required=false) String houseGold,
			@RequestParam(value="questGold", required=false) String questGold
			) {
		int gold = (int) session.getAttribute("gold");
		if(farmGold!=null) {
			int amount = new Random().nextInt(11)+10;
			gold += amount;
			session.setAttribute("gold", gold);
			return "redirect:/";
		}
		return "redirect:/";
	}

}
