package pilaGenericTest;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


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
		pilaPrueba.reverse();
		assertEquals(PilaReverse, pilaPrueba.getList());
		
	}
	
	@Test
	void testPush() {
		pilaPrueba.push("uva");
		assertEquals(5, pilaPrueba.getList().size());
		
	}
	
	@Test
	void testPeek() {
		ArrayList<String> PilaPeek = new ArrayList<String>();
		String lastElement = "Viviana";
		PilaPeek.add("Lucy");
		PilaPeek.add("Patricia");
		PilaPeek.add("Paz");
		PilaPeek.add(lastElement);
		assertEquals(lastElement, pilaPrueba.peek());
		
	}
	
	@Test
	void testPop() {
		ArrayList<String> PilaPoop = new ArrayList<String>();
		PilaPoop.add("Lucy");
		PilaPoop.add("Patricia");
		PilaPoop.add("Paz");
		assertEquals(PilaPoop, pilaPrueba.pop());
		
	}


}
