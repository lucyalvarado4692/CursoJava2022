package comparaciones;

import java.util.Set;

import java.util.TreeSet;

import Figuras.Circulo;
import Figuras.Cuadrado;
import Figuras.Figura;
import Figuras.exceptions.ExceptionFigure;

public class ComparacionesExample {

	public static void main(String[] args) throws ExceptionFigure {
		Set <String> listNombres = new TreeSet<>();
		listNombres.add(new String("Gabriel"));
		listNombres.add(new String("Pedro"));
		listNombres.add(new String("Marina"));
		listNombres.add(new String("Paz"));
		listNombres.add(new String("Patricia"));
		listNombres.add(new String("Lucy"));
		listNombres.add(new String("Maria Cristina"));
		listNombres.add(new String("Nerea"));
		listNombres.add(new String("Marta"));
		listNombres.add(new String("Viviana"));
		int i = 1;
		
		for(String nombre : listNombres) { System.out.println(i++ +"nombre" + nombre); }
		 
		Set<Figura> figuras = new TreeSet<>(); 
		figuras.add(new Cuadrado("cuadrado",1)); 
		figuras.add(new Cuadrado("Mi cuadrado",2));
		figuras.add(new Cuadrado("Tu cuadrado",3)); 
		figuras.add(new Cuadrado("El cuadrado",4)); 
		figuras.add(new Cuadrado("El cuadrado de todos",5)); 
		figuras.add(new Cuadrado("El cuadrado de ellos",6)); 
		figuras.add(new Circulo("circulo",7));
		figuras.add(new Circulo("mi circulo",8)); 
		figuras.add(new Circulo("tu circulo",9)); 
		figuras.add(new Circulo("Ahh que  circulo",10));
		figuras.add(new Circulo("tu circulo",11));
		i = 1;
		for(Figura figura : figuras) {
			System.out.println(i++ + "nombre" + figura);
		}
		
				 
	}

}
