package com.codingdojo.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoandninjas.models.Ninja;
import com.codingdojo.dojoandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
private final NinjaRepository ninjaRepository;

public NinjaService(NinjaRepository ninjaRepository) {
	this.ninjaRepository=ninjaRepository;
}

//get all ninjas

public List<Ninja> getAllNinjas(){
	return ninjaRepository.findAll()
;}

//create ninja 

public Ninja createNinja(Ninja ninja) {
	return ninjaRepository.save(ninja);
}

//get ninja by id
public Ninja findNinja(Long id) {
	Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
	if(optionalNinja.isPresent()) {
		return optionalNinja.get();
	} return null;
}

}
