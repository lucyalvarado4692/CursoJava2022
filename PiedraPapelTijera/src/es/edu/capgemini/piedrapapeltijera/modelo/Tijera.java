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
			descripcionResultado = nombre + "le gana a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		default:
			break;
		}
		return result;
	}

}
