package ej14;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
	private int legajo;
	private int edad;
	private String nombre;
	
	
	public Persona(int legajo, String nombre, int edad) {
		super();
		this.legajo = legajo;
		this.edad = edad;
		this.nombre = nombre;
	}
	public Persona(String pNombres, int pEdad) {
		super();

	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, legajo, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && legajo == other.legajo && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Persona [legajo=" + legajo + ", edad=" + edad + ", nombre=" + nombre + "]";
	}
	@Override
	public int compareTo(Persona o) {
		return nombre.compareTo(o.getNombre());
	}
	
	
	
	
	
	
}
