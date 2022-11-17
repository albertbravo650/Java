package com.albertbravo.week4demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.albertbravo.week4demo.models.University;

public interface UniversityRepository extends CrudRepository<University, Long> {
	List<University> findAll();
	
	//List<University> findAllOrderByNameDesc();
}
