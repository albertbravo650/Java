package com.albertbravo.dojosAndNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertbravo.dojosAndNinjas.models.Dojo;
import com.albertbravo.dojosAndNinjas.models.Ninja;
import com.albertbravo.dojosAndNinjas.services.DojoService;
import com.albertbravo.dojosAndNinjas.services.NinjaService;



@Controller
public class MainController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/dojos/new")
	public String home(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newDojo.jsp";
	}
//	
	// show one dojo
	@GetMapping("/dojos/{dojoId}")
	public String showOneDojo(Model model, @PathVariable("dojoId") Long dojoId) {
		Dojo dojo = dojoService.findDojo(dojoId);
		model.addAttribute("dojo", dojo);
		return "showDojo.jsp";
	}
//
	@PostMapping("/dojos/create")
	public String create(
			@Valid @ModelAttribute("dojo") Dojo dojo,
			BindingResult result, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String createNinja(
			@Valid @ModelAttribute("ninja") Ninja ninja,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoService.allDojos();
			model.addAttribute("dojos", dojos);
			return "newNinja.jsp";
		}
		else {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos/new";
		}
	}
//			
//	@GetMapping("/expenses/{id}/edit")
//	public String edit(@PathVariable("id") Long id, Model model) {
//		Expense expense = expenseService.findExpense(id);
//		model.addAttribute("expense", expense);
//		return "edit.jsp";
//	}
//
//	@PutMapping("/expenses/{id}")
//	public String update(
//			@Valid @ModelAttribute("expense") Expense expense,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "edit.jsp";
//		}
//		else {
//			expenseService.updateExpense(expense);
//			return "redirect:/expenses";
//		}
//	}
//	
	@DeleteMapping("/dojos/{dojoId}/delete")
	public String destroy(@PathVariable("dojoId") Long dojoId) {
		dojoService.deleteDojo(dojoId);
		return "redirect:/dojos/new";
	}
	
	@DeleteMapping("/ninjas/{ninjaId}/delete")
	public String destroyNinja(@PathVariable("ninjaId") Long ninjaId) {
		ninjaService.deleteNinja(ninjaId);
		return "redirect:/dojos/new";
	}
}
