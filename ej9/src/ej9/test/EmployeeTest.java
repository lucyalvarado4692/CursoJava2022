package ej9.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ej9.Employee;

class EmployeeTest extends Employee {
	
	Employee lucy;
	Employee marta;

	@BeforeEach
	void setUp() throws Exception {
		Date fechaIngresoLucy = new Date(2022,06,13);
		lucy = new Employee(fechaIngresoLucy,16000.00, "Lucy", 37);
	}

	@AfterEach
	void tearDown() throws Exception {
		lucy = null;
		marta = null;
	}

	
	
	@Test
	final void testLucyEquals_true() {
		Date fechaIngresoLucy = new Date(2022,06,13);
		Employee lucyTest = new Employee(fechaIngresoLucy,16000.00, "Lucy", 37);
		assertTrue(lucy.equals(lucyTest));
	}
	
	@Test
	final void testLucyEquals_false() {
		Date fechaIngresoLucy = new Date(2022,06,12);
		Employee lucyTest = new Employee(fechaIngresoLucy,16000.00, "Lucy", 37);
		assertFalse(lucy.equals(lucyTest));
	}
	

}
