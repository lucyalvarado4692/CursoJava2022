package ej8;

import exceptions.ExceptionA;
import exceptions.ExceptionB;

public class ClassA {
	
	public static void a() throws ExceptionA {
		throw new ExceptionA ("Excepcion A :)");
	}
	
	public static void b() throws ExceptionB {
		throw new ExceptionB("Excepcion B :(");
	}


}
