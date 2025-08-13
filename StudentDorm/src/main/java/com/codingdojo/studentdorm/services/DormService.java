package com.codingdojo.studentdorm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.studentdorm.models.Dorm;
import com.codingdojo.studentdorm.repositories.DormRepo;

@Service
public class DormService {
 private final DormRepo dormRepo;

 public DormService (DormRepo dormRepo) {
	 this.dormRepo = dormRepo;
 }
 //get all dorms
 
 public List<Dorm> getAllDorms(){
	 return dormRepo.findAll();
 }
 
 //get dorm by id 
 public Dorm getDormById(Long id) {
	Optional<Dorm> optionalDorm =dormRepo.findById(id);
	if(optionalDorm.isPresent()) {
		return optionalDorm.get();
	}else return null;
	 
 }
 
 //create dorm
 public Dorm createDorm(Dorm d) {
	 return dormRepo.save(d);
 }
 
 
}
