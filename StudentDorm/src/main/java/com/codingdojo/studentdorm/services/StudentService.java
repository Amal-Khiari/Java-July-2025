package com.codingdojo.studentdorm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.studentdorm.models.Student;
import com.codingdojo.studentdorm.repositories.StudentRepo;

@Service
public class StudentService {
public final StudentRepo studentRepo;
public StudentService (StudentRepo studentRepo) {
	this.studentRepo=studentRepo;
}

//return all student 
public List<Student> getAllStudent(){
	return studentRepo.findAll()
;}

//return student by id

public Student getStudentById(Long id) {
	Optional<Student> optionalStudent = studentRepo.findById(id);
	if(optionalStudent.isPresent()) {
		return optionalStudent.get();
	} else 
		return null;
}

//create student
public Student createStudent(Student s) {
	return studentRepo.save(s);
}

//delete 

public void deleteStudent(Long id) {
	studentRepo.deleteById(id);
}
}
