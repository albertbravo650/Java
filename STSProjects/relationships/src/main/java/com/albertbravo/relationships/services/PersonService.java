package com.albertbravo.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertbravo.relationships.models.Person;
import com.albertbravo.relationships.repositories.PersonRepository;


@Service
public class PersonService {
	// adding the book repository as a dependency
		private final PersonRepository personRepository;
		
		public PersonService(PersonRepository personRepository) {
			this.personRepository = personRepository;
		}
		
		// returns all books
		public List<Person> allPeople() {
			return personRepository.findAll();
		}
		
		public Person createPerson(Person p) {
			return personRepository.save(p);
		}
		
		public Person findPerson(Long id) {
			Optional<Person> optionalPerson = personRepository.findById(id);
			if(optionalPerson.isPresent()) {
				return optionalPerson.get();
			}
			else {
				return null;
			}
		}
		
		public Person updatePerson(Person changedPerson) {
			return personRepository.save(changedPerson);
		}
			
		//Delete a book
		public void deletePerson(Long id) {
			personRepository.deleteById(id);
		}

}
