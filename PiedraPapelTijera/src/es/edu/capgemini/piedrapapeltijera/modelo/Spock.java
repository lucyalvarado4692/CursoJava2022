package es.edu.capgemini.piedrapapeltijera.modelo;

public class Spock extends PiedraPapelTijeraFactory {
	

	public Spock(){
		this(SPOCK, "spock");
	}

	public Spock(int pNumero, String pNombre) {
		super(pNumero, pNombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isMe(int pNumero) {
		// TODO Auto-generated method stub
		return pNumero == SPOCK;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		switch(numeroRecibido) {
		case TIJERA:
			result = 1;
			descripcionResultado = nombre + " rompe a " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case PIEDRA:
			result = 1;
			descripcionResultado = nombre + " vaporiza a " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case LAGARTO:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " envenena a  " + nombre ;
			break;
		case PAPEL:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " desautoriza a  " + nombre;
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijeraFactory.getNombre();
			break;
		}
		return result;
	}

}
