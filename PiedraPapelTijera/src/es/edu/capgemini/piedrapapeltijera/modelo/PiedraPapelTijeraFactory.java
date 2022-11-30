package es.edu.capgemini.piedrapapeltijera.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class PiedraPapelTijeraFactory {
	//
	public static final int PIEDRA = 1;
	public static final int PAPEL = 2;
	public static final int TIJERA = 3;
	public static final int LAGARTIJA = 3;
	public static final int SPOCK = 3;
	//atributos
	protected String 								descripcionResultado;
	private static List <PiedraPapelTijeraFactory> 	elementos;
	protected String 								nombre;
	protected int 									numero;
	//constructor que recibe un int
	public PiedraPapelTijeraFactory(int pNumero, String pNombre) {
		super();
		this.numero = pNumero;
		this.nombre = pNombre;
	}
	//getters y settews o accesos
	public String getNombre() {					return nombre;			}
	public void setNombre(String nombre) {		this.nombre = nombre;	}
	
	public int getNumero() {					return numero;			}
	public void setNumero(int numero) {			this.numero = numero;	}
	
	public String getDescripcionResultado() {	return descripcionResultado;}
	//recibe un int y devuelve un boolean, son asbtractos
	public abstract boolean isMe(int pNumero);
	public abstract int comparar(PiedraPapelTijeraFactory pPapelTijeraFactory);
	//metodo de negocio
	public static PiedraPapelTijeraFactory getInstance(int pNumero) {
		//la magia
		//el padre conoce a todos sus hijos, el atributo elemesntos lo creo (instancio)
		elementos = new ArrayList<PiedraPapelTijeraFactory>();
		//luego agrego
		elementos.add(new Piedra());
		elementos.add(new Papel());
		elementos.add(new Tijera());
		//luego de conocer a todos sus hijos le pasamos u for echa para recorrerlo
		for (PiedraPapelTijeraFactory piedraPapelTijeraFactory : elementos) {
			if(piedraPapelTijeraFactory.isMe(pNumero))
				return piedraPapelTijeraFactory;
		}
		
		return null;
	}
	
	
}
