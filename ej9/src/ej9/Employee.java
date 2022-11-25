package ej9;

import java.util.Date;
import java.util.Objects;

public class Employee {
	private Date fechaIngreso;
	private double salario;
	private String nombre;
	private int edad;
	
	public Employee() {
		nombre = "";
		fechaIngreso = new Date();
	}
	
	
	public Employee(Date fechaIngreso, double salario, String nombre, int edad) {
		super();
		setFechaIngreso(fechaIngreso);
		this.salario = salario;
		setNombre(nombre);
		this.edad = edad;
	}


	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		if(fechaIngreso == null)
			fechaIngreso = new Date();
		else 
			this.fechaIngreso = fechaIngreso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre == null)
			nombre = "";
		else 
		 this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public int hashCode() {
		//cambiar este hashcode
		return Objects.hash(edad, fechaIngreso, nombre, salario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return edad == other.getEdad() 					&& 
				fechaIngreso.equals(other.fechaIngreso) && 
				nombre.equals(other.getNombre())	    && 
				salario == other.getSalario();
	}
	
	

}
