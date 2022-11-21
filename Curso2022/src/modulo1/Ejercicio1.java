package modulo1;

import java.util.Scanner;
/**
 * 
 * @author lucyalva
 *
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Lucy arregalme esto
		Scanner sc = new Scanner (System.in);
		String str = new String ("Hola mundo");
		
		System.out.println("Ingrese un número: ");
		int i  = sc.nextInt();
		
		int nro = (int)(Math.random()*100);
		
		System.out.println("Loteria gabreliana...;" + nro);
		if(nro == i){
			System.out.println("Ganaste");		
			
		}else {
			System.out.println("Aun no has ganado");	
		}
		
		


	}

}
