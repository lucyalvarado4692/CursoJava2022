package es.edu.capgemini.piedrapapeltijera.modelo;

public class Tijera extends PiedraPapelTijeraFactory {
	
	public Tijera(){
		this(TIJERA, "tijera");
	}

	public Tijera(int pNumero, String pNombre) {
		super(pNumero, pNombre);
	}

	@Override
	public boolean isMe(int pNumero) {
		return pNumero == TIJERA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		switch(numeroRecibido) {
		case PIEDRA:
			result = -1;
			descripcionResultado = nombre + "pierde con " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case PAPEL:
			result = 1;
			descripcionResultado = nombre + " corta a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case SPOCK:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " rompe a " + nombre ;
			break;
		case LAGARTO:
			result = 1;
			descripcionResultado = nombre + " decapita a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijeraFactory.getNombre();
			break;
		}
		return result;
	}

}
