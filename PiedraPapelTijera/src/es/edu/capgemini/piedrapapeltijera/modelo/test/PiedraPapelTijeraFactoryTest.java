package es.edu.capgemini.piedrapapeltijera.modelo.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.edu.capgemini.piedrapapeltijera.modelo.Papel;
import es.edu.capgemini.piedrapapeltijera.modelo.Piedra;
import es.edu.capgemini.piedrapapeltijera.modelo.PiedraPapelTijeraFactory;
import es.edu.capgemini.piedrapapeltijera.modelo.Tijera;

class PiedraPapelTijeraFactoryTest {
	//lote de pruebas
	PiedraPapelTijeraFactory piedra, papel, tijera;

	//lo que rellena mis variables que declare
	@BeforeEach
	void setUp() throws Exception {
		piedra = new Piedra();
		papel = new Papel();
		tijera = new Tijera();
	}
	//le asigna null a los variables que declare, aun no se para que es esto
	@AfterEach
	void tearDown() throws Exception {
		piedra =  null;
		papel = null;
		tijera = null;
	}

	@Test
	void testGetInstancePiedra() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Piedra);
	}
	
	@Test
	void testGetInstancePiedra_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Papel);
	}
	
	@Test
	void testGetInstancePapel() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PAPEL) instanceof Papel);
	}
	
	@Test
	void testGetInstancePapel_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera() {
		assertTrue(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.TIJERA) instanceof Tijera);
	}
	
	@Test
	void testGetInstanceTijera_false() {
		assertFalse(PiedraPapelTijeraFactory.getInstance(PiedraPapelTijeraFactory.PIEDRA) instanceof Tijera);
	}
	
	@Test 
	void testPiedraLeGanaATijera() {
		assertEquals(1, piedra.comparar(tijera));
	}
	
	@Test 
	void testPiedraPierdeconPapel() {
		assertEquals(-1, piedra.comparar(papel));
	}
	
	@Test 
	void testPiedraEmpataconPiedra() {
		assertEquals(0, piedra.comparar(piedra));
	}
	
	@Test 
	void testTijeraLeGanaAPapel() {
		assertEquals(1, tijera.comparar(papel));
	}
	
	@Test 
	void testTijeraPierdeConPiedra() {
		assertEquals(-1, tijera.comparar(piedra));
	}
	
	@Test 
	void testTijeraEmpataconTijera() {
		assertEquals(0, tijera.comparar(tijera));
	}
	
	@Test 
	void testPapelLeGanaAPiedra() {
		assertEquals(1, papel.comparar(piedra));
	}
	
	@Test 
	void testPapelPierdeconTijera() {
		assertEquals(-1, papel.comparar(tijera));
	}
	
	@Test 
	void testPapelEmpataconPapel() {
		assertEquals(0, papel.comparar(papel));
	}
	
	@Test 
	void testPapelEmpataconPapelResultadoDesc() {
		papel.comparar(new Papel());
		assertEquals("papel empata con papel", papel.getDescripcionResultado());
	}
	

}
