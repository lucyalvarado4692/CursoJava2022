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

import com.example.model.Usuario;
import com.example.repo.IUsuarioRepo;

@RestController
public class RestUsuarioController {
	@Autowired
	private IUsuarioRepo repo;
	
	@GetMapping("/usuarios")
	public List<Usuario> listar(){
		return repo.findAll();
	}
	
	@PostMapping("/usuarios")
	public void insertar(@RequestBody Usuario per) {
		repo.save(per);
	}
	
	@PutMapping("/usuarios")
	public void update(@RequestBody Usuario per) {
		repo.save(per);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}


}



