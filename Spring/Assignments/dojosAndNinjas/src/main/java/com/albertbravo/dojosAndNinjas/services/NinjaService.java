package com.albertbravo.dojosAndNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.dojosAndNinjas.models.Ninja;
import com.albertbravo.dojosAndNinjas.repositories.NinjaRepository;



@Service
public class NinjaService {
	// adding the dojo repository as a dependency
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	// returns all Ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}
	
	// create a Ninja
	public Ninja createNinja(Ninja d) {
		return ninjaRepository.save(d);
	}
	
	public Ninja findNinja(Long ninjaId) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(ninjaId);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}
		else {
			return null;
		}
	}
	
	public Ninja updateNinja(Ninja changedNinja) {
		return ninjaRepository.save(changedNinja);
	}
		
	//Delete a ninja
	public void deleteNinja(Long ninjaId) {
		ninjaRepository.deleteById(ninjaId);
	}
}
