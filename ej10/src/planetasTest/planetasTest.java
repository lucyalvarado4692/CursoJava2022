package planetasTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import planetas.Enumeration;

class planetasTest {
	
List<Enumeration> planetas;
	
	@BeforeEach
	void setUp() throws Exception {
		planetas = new ArrayList<Enumeration>();
	}

	@AfterEach
	void tearDown() throws Exception {
		planetas = null;
	}

	@Test
	final void testGetNombreMercurio() {
		assertEquals("Mercurio", Enumeration.Planetas.MERCURIO.getNombre());
	}


	@Test
	final void testGetMasaMercurio() {
		assertEquals(3.303e+23, Enumeration.Planetas.MERCURIO.getMasa());
	}

	@Test
	final void testSetMasaTierra() {
		Enumeration.Planetas.TIERRA.setMasa(45);
		assertEquals(45, Enumeration.Planetas.TIERRA.getMasa());
	}

	@Test
	final void testGetRadioMercurio() {
		assertEquals(2.4397e6,Enumeration.Planetas.MERCURIO.getRadio());
	}


	@Test
	final void testPlanetasEnTotal() {
		assertEquals(8, Enumeration.Planetas.values().length);
	}

}
