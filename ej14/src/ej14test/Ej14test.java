package ej14test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej14.Persona;
import ej14.PersonasUtil;

class Ej14test {
	
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
		cristina = new Persona(2, "Cristina", 32);
		listaDePersonas.add(cristina);
		listaDePersonas.add(lucy);
		listaDePersonas.add(new Persona(3,"Paz", 20));
		listaDePersonas.add(new Persona(4,"Marta", 25));
		listaDePersonas.add(new Persona(5,"Viviana", 35));
		
		p1 = new Persona (1,"Lucy", 30);
		p2 = new Persona (2,"Cristina", 32);
		p3 = new Persona (3,"Paz", 20);
		p4 = new Persona (4,"Marta", 25);
		p5 = new Persona (5,"Viviana", 35);
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
	
	@Test
	void testOrdenaPersonas_true(){
		Persona fulanito = new Persona(5, "fulanito",12); 		//El mas joven
		listaDePersonas.add(fulanito);
		Persona menganito = new Persona(593,"menganito", 42);	//El mas mayor
		listaDePersonas.add(menganito);
		
		Set<Persona> persOrd = PersonasUtil.ordenarPersonas(listaDePersonas);
		Iterator<Persona> it = persOrd.iterator();
		assertEquals(it.next().getNombre(), "Cristina");
		assertEquals(it.next().getNombre(), "Lucy");
		assertEquals(it.next().getNombre(), "Marta");
		assertEquals(it.next().getNombre(), "Paz");
		assertEquals(it.next().getNombre(), "Viviana");
		assertEquals(it.next().getNombre(), "fulanito");
		assertEquals(it.next().getNombre(), "menganito");
	}
	
	

}
