package ej12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetOperationsTest {
	
	Set<String> setStrA;
	Set<String> setStrB;
	
	Set<Integer> setIntA;
	Set<Integer> setIntB;


	@BeforeEach
	void setUp() throws Exception {
		setStrA = new HashSet<String>();
		setStrA.add("Patricia");
		setStrA.add("Lucy");
		setStrA.add("Paz");
		setStrA.add("Cristina");
		setStrA.add("Viviana");
		setStrA.add("Nerea");
		setStrB = new HashSet<String>();
		setStrB.add("Gabriel");
		setStrB.add("Patricia");
		setStrB.add("Lucy");
		setStrB.add("Paz");
		setStrB.add("Cristina");
		setStrB.add("Maria");
		setIntA= new HashSet<Integer>();
		setIntA.add(1);
		setIntA.add(2);
		setIntA.add(3);
		setIntA.add(4);
		setIntB= new HashSet<Integer>();
		setIntB.add(1);
		setIntB.add(2);
		setIntB.add(5);
		setIntB.add(6);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		setIntA = null;
		setIntB = null;
		setStrA = null;
		setStrB = null;
	}

	@Test
	void testUnionInteger() {
		Set<Integer> unionTotal = new HashSet<Integer>();
		unionTotal.add(1);
		unionTotal.add(2);
		unionTotal.add(3);
		unionTotal.add(4);
		unionTotal.add(5);
		unionTotal.add(6);
		assertEquals(unionTotal, SetOperations.union(setIntA, setIntB));
		
		

	}
	@Test
	void testUnionString() {
		Set<String> unionTotal = new HashSet<String>();
		unionTotal.add("Patricia");
		unionTotal.add("Lucy");
		unionTotal.add("Paz");
		unionTotal.add("Cristina");
		unionTotal.add("Viviana");
		unionTotal.add("Nerea");
		unionTotal.add("Gabriel");
		unionTotal.add("Maria");
		assertEquals(unionTotal, SetOperations.union(setStrA, setStrB));
		

	}
	@Test
	void testInterseccion() {
		Set<Integer> interseccionTotal = new HashSet<Integer>();
		interseccionTotal.add(1);
		interseccionTotal.add(2);
		
		assertEquals(interseccionTotal, SetOperations.interseccion(setIntA, setIntB));
	}
	@Test
	void testInterseccionString() {
		Set<String> interseccionTotal = new HashSet<String>();
		interseccionTotal.add("Patricia");
		interseccionTotal.add("Lucy");
		interseccionTotal.add("Paz");
		interseccionTotal.add("Cristina");
		assertEquals(interseccionTotal, SetOperations.interseccion(setStrA, setStrB));
	}
	
	@Test
	void testDiferencia() {
		Set<Integer> diferenciaTotal = new HashSet<Integer>();
		diferenciaTotal.add(3);
		diferenciaTotal.add(4);
		
		assertEquals(diferenciaTotal, SetOperations.diferencia(setIntA, setIntB));
	}
	
	@Test
	void testDiferenciaString() {
		Set<String> diferenciaTotal = new HashSet<String>();
		diferenciaTotal.add("Viviana");
		diferenciaTotal.add("Nerea");
		
		assertEquals(diferenciaTotal, SetOperations.diferencia(setStrA, setStrB));
	}
	
	@Test
	void testDiferenciaSimetrica() {
		Set<Integer> diferenciaSimetrica = new HashSet<Integer>();
		diferenciaSimetrica.add(3);
		diferenciaSimetrica.add(4);
		diferenciaSimetrica.add(5);
		diferenciaSimetrica.add(6);
		
		assertEquals(diferenciaSimetrica, SetOperations.difSimetrica(setIntA, setIntB));
	}
	
	@Test
	void testDiferenciaSimetricaString() {
		Set<String> diferenciaSim = new HashSet<String>();
		diferenciaSim.add("Viviana");
		diferenciaSim.add("Nerea");
		diferenciaSim.add("Gabriel");
		diferenciaSim.add("Maria");
		
		assertEquals(diferenciaSim, SetOperations.difSimetrica(setStrA, setStrB));
	}
	
	

}
