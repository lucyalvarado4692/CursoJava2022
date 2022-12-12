package es.edu.capgemini.piedrapapeltijera.modelo;

public class Piedra extends PiedraPapelTijeraFactory {
	//EL CONSTRUCTOR VACIO SIRVE PARA LLAMAR AL CONSTRUCTOR de abajo Y LE ASIGNA lo que le coloque, que fue la variable piedra que ya almecene y el string pieda
	public Piedra(){
		this(PIEDRA, "piedra");
	}
	
	//este constructor esta llamando a su padre, es lo que conecta el hijo con el padre
	public Piedra(int pNumero, String pNombre) {
		super(pNumero, pNombre);
		// TODO Auto-generated constructor stub
	}
	
	//ESTE METODO COMPARA EL PnUMERO QUE RECIBE CON EL DE LA VARIABLE PIEDRA Y ASI YO SE QUE PIEDRA ES PIEDRA
	@Override
	public boolean isMe(int pNumero) {
		// TODO Auto-generated method stub
		return pNumero == PIEDRA;
	}

	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		switch(numeroRecibido) {
		case PAPEL:
			result = -1;
			descripcionResultado = nombre + " tapa a " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case TIJERA:
			result = 1;
			descripcionResultado = nombre + " aplasta a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case SPOCK:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " vaporiza a " + nombre ;
			break;
		case LAGARTO:
			result = 1;
			descripcionResultado = nombre + " aplasta a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		}
		return result;
	}

}
