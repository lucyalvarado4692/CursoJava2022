package ej2;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// imprimir Hello world
		System.out.println("Hello world");
		//tablas de multiplicar
		int index = 0, result = 0, tabla = 0;
		for (tabla = 1; tabla <= 10; tabla++) {
			for(index = 1; index <10; index++) {
				result = tabla * index;
				System.out.println(tabla + "x" + index + "=" + result);
			}
			result = tabla * index;
			System.out.println(tabla + "x" + index + "=" + result);
			System.out.println("");
		}
		// notas alumnos
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nota: ");
		int nota  = sc.nextInt();
		if(nota > 0 && nota < 101) {
			if(nota >= 0 && nota <= 50 ) {
				System.out.println("Calificación suspenso");
			}
			if(nota >= 51 && nota <= 75 ) {
				System.out.println("Calificación Recuperar");
			}
			if(nota >= 76 && nota <= 90 ) {
				System.out.println("Calificación Aprobado");
			}
			if(nota >= 91 && nota <= 100 ) {
				System.out.println("Calificación Aprobado con mérito");
			}
		}
		else{
			System.out.println("Puntuación invalida");
		}
		
		
	}

}
