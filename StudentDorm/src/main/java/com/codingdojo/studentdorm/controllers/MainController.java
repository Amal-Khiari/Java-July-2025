package com.codingdojo.studentdorm.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.codingdojo.studentdorm.models.Dorm;
import com.codingdojo.studentdorm.models.Student;
import com.codingdojo.studentdorm.services.DormService;
import com.codingdojo.studentdorm.services.StudentService;

import jakarta.validation.Valid;

@Controller
public class MainController {
private final DormService dormService;
private final StudentService studentService;

public MainController(DormService dormService,StudentService studentService) {
	this.dormService=dormService;
	this.studentService=studentService;
}

//dashboard
@RequestMapping("/dorms")
public String index(@ModelAttribute("dorm") Dorm dorm,Model model) {
	model.addAttribute("dorms",dormService.getAllDorms());
	
	return "index.jsp";
}

//Display Dorm details

@GetMapping("/dorm/display/{dormId}")
public String details(@PathVariable("dormId") Long id, Model model) {
 Dorm dorm = dormService.getDormById(id);
 List<Student> students=studentService.getAllStudent();
 model.addAttribute("students",students);
 model.addAttribute("dorm", dorm);
 return "display.jsp";
}

//create new dorm
@PostMapping("/create/dorm")
public String makeDorm(@Valid @ModelAttribute("dorm") Dorm dorm,BindingResult result) {
	if(result.hasErrors()) {
		return "redirect:/";
	}
	dormService.createDorm(dorm);
	return "redirect:/dorms";
}

@RequestMapping("/dorms/new")
public String redirectDorm(@Valid @ModelAttribute("dorm") Dorm dorm) {
	
	return "new_dorm.jsp";
}

//create student
@PostMapping("/create/student")
public String makeStudent(@Valid @ModelAttribute("student") Student student,BindingResult result) {
	if(result.hasErrors()) {
		return "redirect:/dorms";
	}
	studentService.createStudent(student);
	return "redirect:/dorms";
}

//redirect create page 
@RequestMapping("/students/new")
public String redirectNewStudent(@Valid @ModelAttribute("student") Student student,Model model) {
	model.addAttribute("dorms",dormService.getAllDorms());
	return "new_student.jsp";
}

//remove student 
@RequestMapping(value="/student/delete/{StudentId}",method=RequestMethod.POST)
public String destroy(@PathVariable("StudentId") Long id,
		@RequestParam("_method") String method) {
	if("delete".equals(method)) {
		studentService.deleteStudent(id);
	}
 
    return "redirect:/dorms";
}

//edit dorm
@RequestMapping("/student/edit/{dormId}")

	public String update(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model,@PathVariable("dormId") Long id) {
	    if (result.hasErrors()) {
	        model.addAttribute("student", student);
	        return "display.jsp";
	    } else {
	    	System.out.println(student.getName());
	        Dorm dorm = dormService.getDormById(id);
	    	student.setDorm(dorm);
	    	
	        return "redirect:/dorms";
	    }
	}

}
