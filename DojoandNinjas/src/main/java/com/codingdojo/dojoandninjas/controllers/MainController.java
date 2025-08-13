package com.codingdojo.dojoandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojoandninjas.models.Dojo;
import com.codingdojo.dojoandninjas.models.Ninja;
import com.codingdojo.dojoandninjas.services.DojoService;
import com.codingdojo.dojoandninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
private final DojoService dojoService;
private final NinjaService ninjaService;

public MainController(DojoService dojoService,NinjaService ninjaService) {
	this.dojoService=dojoService;
	this.ninjaService=ninjaService;
}

@RequestMapping("/")
public String index(@ModelAttribute("dojo") Dojo dojo,Model model) {
	model.addAttribute("dojos",dojoService.getAll());
	return "index.jsp";
}


@PostMapping("/create")
public String makeDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result) {
	if(result.hasErrors()) {
		return "redirect:/";
	}
	dojoService.create(dojo);
	return "redirect:/";
}

@RequestMapping("/new/ninja")
public String newNinjaPage(@ModelAttribute("ninja") Ninja ninja,Model model) {
model.addAttribute("dojos",dojoService.getAll());
return "add_ninja.jsp";	
}

@PostMapping("/create/ninja")
public String makeNinja(@Valid @ModelAttribute("ninja") Ninja ninja,BindingResult result) {
	if(result.hasErrors()) {
		return "redirect:/";
	}
	ninjaService.createNinja(ninja);
	return "redirect:/";
}

// display dojo datails
@GetMapping("/dojos/display/{dojoId}")
public String details(@PathVariable("dojoId") Long id, Model model) {
    Dojo dojo =dojoService.findDojo(id);
    model.addAttribute("dojo", dojo);
    return "details.jsp";
}
	
}
