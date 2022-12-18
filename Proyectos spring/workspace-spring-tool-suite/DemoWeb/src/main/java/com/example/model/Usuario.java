package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {

	@Id
	private int codigo;
	
	@Column(name = "PER_CLAVE", length = 50)
	private String clave;
	
	@Column(name = "PER_NOMBRE", length = 50)
	private String nombre;
	
	public Usuario() {

	}
	public Usuario(int codigo, String clave, String nombre) {
		super();
		this.codigo = codigo;
		this.clave = clave;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
