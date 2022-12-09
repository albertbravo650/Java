package com.albertbravo.tuesdayweek3demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/") //Root route
	public String homeRoute() {
		return "Yay! This is my first Spring Boot app!!!";
	}
}
