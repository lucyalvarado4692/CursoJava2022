package es.edu.capgemini.piedrapapeltijera.modelo;

public class Lagarto extends PiedraPapelTijeraFactory {

	public Lagarto(){
		this(LAGARTO, "lagarto");
	}
	
	public Lagarto(int pNumero, String pNombre) {
		super(pNumero, pNombre);
		
	}

	@Override
	public boolean isMe(int pNumero) {
		// TODO Auto-generated method stub
		return pNumero == LAGARTO;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		switch(numeroRecibido) {
		case PIEDRA:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " aplasta a " + nombre;
			break;
		case TIJERA:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " decapita a  " + nombre;
			break;
		case SPOCK:
			result = 1;
			descripcionResultado = nombre + " envenena a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case PAPEL:
			result = 1;
			descripcionResultado = nombre + " devora a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		}
		return result;
	}

}
