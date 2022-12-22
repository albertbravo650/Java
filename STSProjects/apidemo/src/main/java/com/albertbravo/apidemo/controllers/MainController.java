package com.albertbravo.apidemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Value("${nasaApiKey:TEST}")
	private String thisApiKey;
	
	@GetMapping("/")
	public String mainPage() {
		System.out.println(thisApiKey);
		return "home.jsp";
		// https://api.nasa.gov/planetary/apod?api_key=hTf0NvqbU5NJ0m7cpixJakprwm8q8VcPkc721VD4
	}

}
