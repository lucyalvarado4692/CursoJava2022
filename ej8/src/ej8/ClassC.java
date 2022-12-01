package ej8;

import exceptions.ExceptionA;

public class ClassC {
	
	static ClassA c;

	public static void main(String[] args) {
		//Lanzamos la excepcion checked ExceptionA
		try {
			ClassA.a();
		} catch (ExceptionA e) {
			e.printStackTrace();
		}
		//Lanzamos la excepcion unchecked Exception B
		ClassA.b();
	}
}
