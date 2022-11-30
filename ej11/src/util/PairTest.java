package util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PairTest {

	String miString;
	Integer miInteger;
	@BeforeEach
	void setUp() throws Exception {
		miString = new String("Gabrielito");
		miInteger = new Integer(10);
	}

	@AfterEach
	void tearDown() throws Exception {
		miString = null;
		miInteger = null;
		
	}

	@Test
	void testConstructorConString() {
		Pair<String> strPair= new Pair<String>(miString, "Casas");
		String first = strPair.getFirst();
		String second = strPair.getSecond();
		
		assertEquals("Gabrielito", first);
		assertEquals("Casas", second);
	}
	
	void testConstructorConInteger() {
		Pair<Integer> intPair= new Pair<Integer>(miInteger, new Integer(20));
		Integer first = intPair.getFirst();
		Integer second = intPair.getSecond();
		
		assertEquals(new Integer(20), first);
		
	}

}
