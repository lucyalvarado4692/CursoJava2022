package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.model.Usuario;

import com.example.repo.IUsuarioRepo;

public class UserController {
	
	private IUsuarioRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Bambi") String name, Model model) {
//		if(name==null || name.isEmpty())
	//		name="LucyCode";

		Usuario per = new Usuario(0, "lucyalva", "123456");
		repo.save(per);
		//model.addAttribute("name", name);
		return "greeting";
		
	}

}
