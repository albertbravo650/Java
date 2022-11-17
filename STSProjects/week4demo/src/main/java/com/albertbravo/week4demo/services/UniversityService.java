package com.albertbravo.week4demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albertbravo.week4demo.models.University;
import com.albertbravo.week4demo.repositories.UniversityRepository;

@Service
public class UniversityService {
	@Autowired
	private UniversityRepository universityRepository;
	
	//Methods to interact with our repository
	//Add a University
	public University createUniversity(University newUniversity) {
		return universityRepository.save(newUniversity);
	}
	
	//Get all Universities
	public List<University> getAllUniversities() {
		return universityRepository.findAll();
	}
	
	//Get one University
	public University getOneUniversities(Long id) {
		Optional<University> optionalUniversity = universityRepository.findById(id);
		if(optionalUniversity.isPresent()) {
			return optionalUniversity.get();
		}
		else {
			return null;
		}
	}
	
	//Update a University
	public University updateUniversity(University changedUniversity) {
		return universityRepository.save(changedUniversity);
	}
	
	//Delete a University
	public void deleteUniversity(Long id) {
		universityRepository.deleteById(id);
	}

}
