package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class PersonController {
	
	
	@Autowired
	PersonRepository personRepository;
	
	@RequestMapping("/person")
	public String getPersonData(Model model) {
		//Pageable pageable = new Pageable();
		
		model.addAttribute("persons", personRepository.findAll());
		model.addAttribute("personswithkota", personRepository.findByLastName("KOTA"));
		return "person";
	}
	
	@PostMapping(value="/saveperson"
			)
	public String savePersonData(@RequestParam String firstName,@ModelAttribute String lastName, Model model) {
		
		Person person = new Person();
		person.setFirstName(firstName);
		personRepository.save(person);
		
		
		//Pageable pageable = new Pageable();
		
		model.addAttribute("persons", personRepository.findAll());
		model.addAttribute("personswithkota", personRepository.findByLastName("s"));
		return "person";
	}
	

}
