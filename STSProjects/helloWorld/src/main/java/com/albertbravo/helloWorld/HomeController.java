package com.albertbravo.helloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/search")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for nothinggggg...";
		}
		else {
			return "You searched for: " + searchQuery;
		}
	}
	
	@RequestMapping("/home")
	public String index2() {
		return "<h1 style='color: green'> Hello. You are home. :) </h1>";
	}
	
	@RequestMapping("/{number1}/{number2}/{number3}")
	public String showNumbers(@PathVariable("number1") String number1,
			@PathVariable("number2") String number2, @PathVariable("number3") String number3) {
		return "Number 1: " + number1 + ", Number 2: " + number2 + ", Number 3: " + number3;
	}
}
