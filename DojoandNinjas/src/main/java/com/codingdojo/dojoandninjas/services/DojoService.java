package com.codingdojo.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoandninjas.models.Dojo;
import com.codingdojo.dojoandninjas.repositories.DojoRepository;

@Service
public class DojoService {
private final DojoRepository dojoRepository;

public DojoService(DojoRepository dojoRepository) {
	this.dojoRepository=dojoRepository;
}

//get all dojos

public List<Dojo> getAll(){
	return dojoRepository.findAll();
}
	
//create dojo 

public Dojo create(Dojo d) {
	return dojoRepository.save(d);
}

//find dojo by id
public Dojo findDojo(Long id) {
	Optional<Dojo> optionalDojo = dojoRepository.findById(id);
	if(optionalDojo.isPresent()) {
		return optionalDojo.get();
	} else 
		return null;
}

}
