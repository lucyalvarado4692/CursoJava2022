package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
	
	@Id
	private int codigo;
	@Column(name = "PER_NOMBRE", length = 50)
	private String nombre;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Persona(int pCodigo, String pNombre) {
		super();
		this.codigo = pCodigo;
		this.nombre = pNombre;
	}
	
	public Persona() {
		
	}
	
	
	

}
