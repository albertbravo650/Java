package com.albertbravo.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.dojosAndNinjas.models.Dojo;
import com.albertbravo.dojosAndNinjas.repositories.DojoRepository;



@Service
public class DojoService {
	// adding the dojo repository as a dependency
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	// returns all dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();
	}
	
	// create a dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	public Dojo findDojo(Long dojoId) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(dojoId);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}
		else {
			return null;
		}
	}
	
	public Dojo updateDojo(Dojo changedDojo) {
		return dojoRepository.save(changedDojo);
	}
		
	//Delete a book
	public void deleteDojo(Long dojoId) {
		dojoRepository.deleteById(dojoId);
	}
}
