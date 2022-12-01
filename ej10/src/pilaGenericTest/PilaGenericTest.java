package pilaGenericTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.training.java.ej2.MiPila;

import PilaGeneric.PilaGeneric;

class PilaGenericTest<T> {
	
	PilaGeneric<String> pilaPrueba;

	@BeforeEach
	void setUp() throws Exception {
		pilaPrueba = new PilaGeneric<String>();
		pilaPrueba.push("Lucy");
		pilaPrueba.push("Patricia");
		pilaPrueba.push("Paz");
		pilaPrueba.push("Viviana");
	
		
	}

	@AfterEach
	void tearDown() throws Exception {
		pilaPrueba = null;
	}

	@Test
	void testReverse() {
		PilaGeneric<String> PilaReverse = new PilaGeneric<String>();
		PilaReverse.push("Viviana");
		PilaReverse.push("Paz");
		PilaReverse.push("Patricia");
		PilaReverse.push("Lucy");
		assertEquals(PilaReverse, pilaPrueba.reverse(pilaPrueba));
		
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
		assertEquals(PilaPush, pilaPrueba.push(pString));
		
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
