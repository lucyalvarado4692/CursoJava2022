package ej13test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej13.Persona;
import ej13.PersonasUtil;

class Ej13test {
	
	private Persona lucy;
	private Persona cristina;
	private Persona p1;
	private Persona p2;
	private Persona p3;
	private Persona p4;
	private Persona p5;
	
	
	List<Persona> listaDePersonas;
	
	@BeforeEach
	void setUp() throws Exception {
		listaDePersonas = new ArrayList<Persona>();
		
		lucy= new Persona(1, "Lucy", 30);
		cristina = new Persona(2, "Cristina", 30);
		listaDePersonas.add(cristina);
		listaDePersonas.add(lucy);
		listaDePersonas.add(new Persona(3,"Paz", 20));
		listaDePersonas.add(new Persona(4,"Marta", 20));
		listaDePersonas.add(new Persona(5,"Viviana", 20));
		
		p1 = new Persona (1,"Lucy", 30);
		p2 = new Persona (2,"Cristina", 30);
		p3 = new Persona (3,"Paz", 20);
		p4 = new Persona (4,"Marta", 20);
		p5 = new Persona (5,"Viviana", 20);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		lucy = null;
		cristina = null;
		p1 = null;
		p2= null;
		p3 = null;
		p4 = null;
		p5 = null;
		
		
	}

	@Test
	void testGetPersonas_true() {
		Map<Integer, Persona> mapPersonas = new HashMap<Integer, Persona>();
		mapPersonas.put(p1.getLegajo(), p1);
		mapPersonas.put(p2.getLegajo(), p2);
		mapPersonas.put(p3.getLegajo(), p3);
		mapPersonas.put(p4.getLegajo(), p4);
		mapPersonas.put(p5.getLegajo(), p5);
		
		assertEquals(mapPersonas, PersonasUtil.getPersonas(listaDePersonas));
	}
	
	@Test
	void testGetPersonas_false() {
		p1.setNombre("Gabrielito");
		Map<Integer, Persona> mapPersonas = new HashMap<Integer, Persona>();
		mapPersonas.put(p1.getLegajo(), p1);
		mapPersonas.put(p2.getLegajo(), p2);
		mapPersonas.put(p3.getLegajo(), p3);
		mapPersonas.put(p4.getLegajo(), p4);
		mapPersonas.put(p5.getLegajo(), p5);
		
		assertNotEquals(mapPersonas, PersonasUtil.getPersonas(listaDePersonas));
	}

}
