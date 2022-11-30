package com.capgemini.training.java.ej2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.MiPila;

class MiPilaTest {
	
	ArrayList<String> pilaPrueba;

	@BeforeEach
	void setUp() throws Exception {
		pilaPrueba = new ArrayList<String>(); 
		pilaPrueba.add("Lucy");
		pilaPrueba.add("Patricia");
		pilaPrueba.add("Paz");
		pilaPrueba.add("Viviana");
	}

	@AfterEach
	void tearDown() throws Exception {
		pilaPrueba = null;
	}

	@Test
	void testReverse() {
		ArrayList<String> PilaReverse = new ArrayList<String>();
		PilaReverse.add("Viviana");
		PilaReverse.add("Paz");
		PilaReverse.add("Patricia");
		PilaReverse.add("Lucy");
		assertEquals(PilaReverse, MiPila.reverseTest(pilaPrueba));
		
	}
	
	@Test
	void testPush() {
		ArrayList<String> PilaPush = new ArrayList<String>();
		String pString = "Elena";
		PilaPush.add("Lucy");
		PilaPush.add("Patricia");
		PilaPush.add("Paz");
		PilaPush.add("Viviana");
		PilaPush.add(pString);
		assertEquals(PilaPush, MiPila.pushTest(pString, pilaPrueba));
		
	}
	
	@Test
	void testPeek() {
		ArrayList<String> PilaPeek = new ArrayList<String>();
		String lastElement = "Viviana";
		PilaPeek.add("Lucy");
		PilaPeek.add("Patricia");
		PilaPeek.add("Paz");
		PilaPeek.add(lastElement);
		assertEquals(lastElement, MiPila.peekTest(pilaPrueba));
		
	}
	
	@Test
	void testPop() {
		ArrayList<String> PilaPoop = new ArrayList<String>();
		PilaPoop.add("Lucy");
		PilaPoop.add("Patricia");
		PilaPoop.add("Paz");
		assertEquals(PilaPoop, MiPila.popTest(pilaPrueba));
		
	}

}
