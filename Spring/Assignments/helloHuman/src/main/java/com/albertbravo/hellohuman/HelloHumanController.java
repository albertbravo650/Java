package com.albertbravo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	@RequestMapping("")
	public String index(@RequestParam(value="name", required=false) String searchQuery,
			@RequestParam(value="last_name", required=false) String searchLast,
			@RequestParam(value="times", required=false) Integer times) {
		int num1 = 1;
		if(searchQuery == null || searchLast == null || times == null) {
			return "Hello human";
		}
		else {
			String newString = "";
			while(num1 <= times) {
				newString = "Hello " + searchQuery + " " + searchLast + newString;
				num1++;
			}
			return newString;
		}
	}
}
