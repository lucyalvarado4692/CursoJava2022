package ej7Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej7.Ascendente;

class ej7test {
	
	int[] arrayDeEnteros;

	@BeforeEach
	void setUp() throws Exception {
		arrayDeEnteros = new int[5];
		arrayDeEnteros[0]= 20;
		arrayDeEnteros[1]= 40;
		arrayDeEnteros[2]= 30;
		arrayDeEnteros[3]= 60;
		arrayDeEnteros[4]= 50;
		
		
	}
	
		
	

	@AfterEach
	void tearDown() throws Exception {
		
		arrayDeEnteros = null;
	}

	@Test
	void testAscendent() {
		int[] pArrayDeEnteros;
		pArrayDeEnteros = new int[5];
		pArrayDeEnteros[0]= 20;
		pArrayDeEnteros[1]= 30;
		pArrayDeEnteros[2]= 40;
		pArrayDeEnteros[3]= 50;
		pArrayDeEnteros[4]= 60;
		assertEquals(60, Ascendente.ordenAscendente(pArrayDeEnteros) );
		
	}

}
