package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Persona;
import com.example.repo.IPersonaRepo;

@Controller
public class DemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		if(name==null || name.isEmpty())
	//		name="LucyCode";

		Persona per = new Persona(5, "Marta");
		repo.save(per);
		model.addAttribute("name", name);
		return "greeting";
		
	}

}
