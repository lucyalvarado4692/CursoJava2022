package es.edu.capgemini.piedrapapeltijera.modelo;

import java.util.Scanner;

public class Jugar {

	public static void main(String[] args) {
		System.out.println("Vamos a jugar piedra, papel, tijera, lagarto o spock");
		//el numero que elije un usuario
		System.out.println("Ingrese un numero 1-piedra, 2-papel, 3-tijera, 4-lagarto, 5-spock");
		Scanner sc = new Scanner(System.in);
		int nro = sc.nextInt();
		//el numero que selecciona el ordenador
		int nroOrdenador = (int) (Math.random()*5) + 1;
		
		PiedraPapelTijeraFactory pptUsuario = PiedraPapelTijeraFactory.getInstance(nro);
		PiedraPapelTijeraFactory pptOrdenador = PiedraPapelTijeraFactory.getInstance(nroOrdenador);
		
		pptUsuario.comparar(pptOrdenador);
		
		System.out.println("\n\nEl resultado del juego es...");
		System.out.println("el usuario eligio..." + pptUsuario.getNombre());
		System.out.println("El ordenador eligio" + pptOrdenador.getNombre());
		System.out.println("resultado" + pptUsuario.getDescripcionResultado());
		sc.close();
	}

}
