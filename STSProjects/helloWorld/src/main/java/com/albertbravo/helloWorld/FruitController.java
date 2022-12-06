package com.albertbravo.helloWorld;

//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	@RequestMapping("/")
	public String dailyFruit(HttpSession session) {
		session.setAttribute("fruit", "pear");
		return "demo.jsp";
	}
	
	@RequestMapping("/fruit")
	public String sameFruit(HttpSession session) {
		String theFruit = (String) session.getAttribute("fruit");
		System.out.println(theFruit);
		return "demo2.jsp";
	}
}
