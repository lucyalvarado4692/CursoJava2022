package ej5;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {
	
	static Guitarra guitarra;
	static Piano piano;
	static List<InstrumentosMusicales> instrumentos;
	
	public static void main(String[] args) {
		guitarra = new Guitarra("Guitarra", null );
		piano = new Piano("Piano", null );
		instrumentos = new ArrayList<>();
		instrumentos.add(guitarra);
		instrumentos.add(piano);
		//el concierto
		for(int index = 0; index < instrumentos.size(); index++) {
			InstrumentosMusicales element = instrumentos.get(index);
			System.out.print(element.getSonidoDelInstrumento() + " ");
		}
	}

	

}
