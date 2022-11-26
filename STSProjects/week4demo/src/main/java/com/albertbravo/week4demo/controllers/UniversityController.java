package com.albertbravo.week4demo.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;

import com.albertbravo.week4demo.models.University;
import com.albertbravo.week4demo.services.UniversityService;

@Controller
public class UniversityController {
	@Autowired
	private UniversityService universityService;
	
	@GetMapping("/")
	public String homeRoute() {
		return "redirect:/universities";
	}
	
	@GetMapping("/universities")
	public String allUniversitiesPage(Model viewModel) {
		viewModel.addAttribute("universities", universityService.getAllUniversities());
		return "universities.jsp";
	}
	
	@GetMapping("/universities/{id}")
	public String viewOneUniversityPage(Model viewModel, @PathVariable("id") Long id) {
		viewModel.addAttribute("thisUniversity", universityService.getOneUniversities(id));
		return "viewoneuniversity.jsp";
	}
	
	@GetMapping("/universities/new")
	public String newUniversity(@ModelAttribute("newUniversity") University thisUniversity) {
		return "newuniversity.jsp";
	}
	
	@PostMapping("/universities/new")
	public String addUniversityToDB(
			@Valid @ModelAttribute("newUniversity") University aNewUniversity,
			BindingResult result) {
		//if the validation fails
		if(result.hasErrors()) {
			//model.attribute
			return "newuniversity.jsp";
		}
		//if the validation succeeds
		universityService.createUniversity(aNewUniversity);
		return "redirect:/";
	}
	
	@GetMapping("/universities/{id}/edit")
	public String editOneUniversity(@PathVariable Long id, Model viewModel) {
		viewModel.addAttribute("thisUniversity", universityService.getOneUniversities(id));
		return "edituniversity.jsp";
	}
	
	@PutMapping("/universities/{id}/edit")
	public String editUniversityInDB(
			@Valid @ModelAttribute("thisUniversity") University changedUniversity,
			BindingResult result,
			@PathVariable Long id) {
		//if the validation fails
		if(result.hasErrors()) {
			//model.attribute
			return "edituniversity.jsp";
		}
		else {
			//if the validation succeeds
			universityService.updateUniversity(changedUniversity);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/university/{id}/delete")
	public String deleteFromDB(@PathVariable("id" Long id)) {
		universityService.deleteUniversity(id);
		return "redirect:/universities";
	}
	
}
