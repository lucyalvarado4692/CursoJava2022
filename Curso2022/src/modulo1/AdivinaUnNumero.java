package modulo1;

import java.util.Scanner;

public class AdivinaUnNumero {

	public static void main(String[] args) {
		// 1- consigna es el ordenador elige un numero entre el 0 y 100
		// 2- el participante ingresa un numero
		// 3- El sistema debe indicar si el numero ingresado es mayor o menor al numero elegido por el ordenador
		// 4. Se debera contar los intentos 
		// nota debe usarse algun tipo de ciclo
		// al finalizar debera felicitar y decir en cuantos intentos lo logro
		
		Scanner sc = new Scanner (System.in);
		int nro = (int)(Math.random()*100);
		
		
		System.out.println("Ingrese un número: ");
		int i  = sc.nextInt();
		System.out.println(nro);
		
		int index = 0; 
		
		while (!(i == nro)){
			if(i>nro || i<nro) {
				if(i>nro) {
				System.out.println("El numero ingresado es mayor al asignado por el ordenador. Sigue intentandolo ");}
				if(i<nro) {
					System.out.println("El numero ingresado es menor al asignado por el ordenador. Sigue intentandolo ");}
				index++;
				System.out.println("Ingrese un número: ");
				i  = sc.nextInt();
			}else{
				break;	
			}
			if(i == nro) {
				System.out.println("El numero es correcto. El numero de intentos fue: " + index);
			}			
		}	
	}
}
