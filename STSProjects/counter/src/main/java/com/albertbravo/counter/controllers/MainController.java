package com.albertbravo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/your_server")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "index.jsp";
	}
	
	@GetMapping("/your_server/counter")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("showCount", currentCount);
		return "count.jsp";
	}

}
