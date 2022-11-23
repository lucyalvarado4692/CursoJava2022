package ej2;

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
	}

}
