package Figuras.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Figura;
import Figuras.exceptions.ExceptionFigure;

class FiguraTest {
	//lote de pruebas
	Cuadrado cuaVacio;
	Cuadrado cuaLleno;
	Circulo cirVacio;
	Circulo cirLleno;
	
	//la lista se guard en forma ordered, permite duplicar
	List<Figura> figurasList;
	//es unordered, no permite duplicados
	Set<Figura> figurasSet;
	

	@BeforeEach
	void setUp() throws Exception {
		cuaVacio = new Cuadrado();
		cuaLleno = new Cuadrado("cuadrado", 10);
		
		cirVacio = new Circulo();
		cirLleno = new Circulo("circulo", 10);
		
		figurasList = new ArrayList<>();
		figurasList.add(cuaVacio);
		figurasList.add(cuaLleno);
		figurasList.add(cirVacio);
		figurasList.add(cirLleno);
		figurasList.add(new Cuadrado("cuadrado 2", 15));
		figurasList.add(new Circulo("circulo 2", 15));
		
		figurasSet = new HashSet<>();
		figurasSet.add(cuaVacio);
		figurasSet.add(cuaLleno);
		figurasSet.add(cirVacio);
		figurasSet.add(cirLleno);
		figurasSet.add(new Cuadrado("cuadrado 2", 15));
		figurasSet.add(new Circulo("circulo 2", 15));
		
	}

	@AfterEach
	void tearDown() throws Exception {
		cuaVacio = null;
		cuaLleno = null;
		cirVacio = null;
		cirLleno = null;
		figurasList = null;
		figurasSet= null;
		Figura.clear();
	}

	@Test
	void testCuadradoLlenoGetNombre() {
		assertEquals("cuadrado", cuaLleno.getNombre());
	}
	
	@Test
	void testCuadradoLlenoGetLado() {
		assertEquals(10, cuaLleno.getLado(), 0.001);
	}
	
	@Test
	void testCuadradoPerimetro() {
		assertEquals(40,cuaLleno.calcularPerimetro(), 0.001);
	}
	
	@Test
	void testCuadradoSuperficie() {
		assertEquals(100,cuaLleno.calcularSuperficie(), 0.001);
	}
	
	@Test
	void tetsCuadradiEqualsHashCodeList_True() throws ExceptionFigure {
		assertTrue(figurasList.contains(new Cuadrado("cuadrado",10)));
	}
	
	@Test
	void tetsCuadradiEqualsHashCodeList_False() {
		try {
			assertFalse(figurasList.contains(new Cuadrado("cuadradido",10)));
		} catch (ExceptionFigure e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	
	@Test
	void tetsCuadradiEqualsList_cantidad() {
		figurasList.add(new Cuadrado());
		assertEquals(7, figurasList.size());
	}
	
	
	@Test
	void tetsCuadradiEquals_cantidad() throws ExceptionFigure {
		figurasSet.add(new Cuadrado("cuadrado",10));
		assertEquals(6, figurasSet.size());
	}
	
	@Test
	void tetsCuadradiEquals_true() throws ExceptionFigure {
		Cuadrado miCuadrado = new Cuadrado("cuadrado",10);
		assertTrue(cuaLleno.equals(miCuadrado));
	}
	
	@Test
	void tetsCuadradiEquals_false() throws ExceptionFigure {
		Cuadrado miCuadrado = new Cuadrado("cuadradito",15);
		assertFalse(cuaLleno.equals(miCuadrado));
	}
	
	@Test
	void tetsCuadradoFiguraException() {
		Cuadrado cua = new Cuadrado();
		System.out.println("la lista de figuras");
		System.out.println(figurasList);
		System.out.println("cuadrado lleno" + cuaLleno);
		try {
			cua.setLado(-10);
		}catch(ExceptionFigure e){
			assertEquals("El valor del lado no puede ser negativo", e.getMessage());
			e.printStackTrace();
		}
	}
	
	@Test
	void testCantidadDeObjetos() {
		assertEquals(8, Figura.getCantidadDefiguras());
	}
	
	@Test
	void testCantidadDeObjetos10() {
		Cuadrado cua = new Cuadrado();
		Cuadrado cuo = new Cuadrado();
		assertEquals(10, Figura.getCantidadDefiguras());
	}


}
