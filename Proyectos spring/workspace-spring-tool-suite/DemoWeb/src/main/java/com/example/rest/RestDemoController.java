package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Persona;
import com.example.repo.IPersonaRepo;

@RestController
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	
	@GetMapping("/personas")
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping("/personas")
	public void insertar(@RequestBody Persona per) {
		repo.save(per);
	}
	
	@PutMapping("/personas")
	public void update(@RequestBody Persona per) {
		repo.save(per);
	}
	
	@DeleteMapping("/personas/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
