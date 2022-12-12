package es.edu.capgemini.piedrapapeltijera.modelo;

public class Papel extends PiedraPapelTijeraFactory {
	//llamo al constructor lleno y le agrege los valores
	public Papel(){
		this(PAPEL, "papel");
	}
	//llamo a papa
	public Papel(int pNumero, String pNombre) {
		super(pNumero, pNombre);	
	}
	//VEO SI ESTE VALOR CPORRESPINDE CON PAPEL
	@Override
	public boolean isMe(int pNumero) {	
		return pNumero == PAPEL;
	}
	// HAGO COMPARACIONES LO MEJORRAMOS CUANDO HAGAMOS LOS TESTS
	//estas comparaciones me indican si gano o pierdo dependiendo del valor en numeor que recibo y el numero que ya habia asignado a cada variable;
	@Override
	public int comparar(PiedraPapelTijeraFactory pPiedraPapelTijeraFactory) {
		int result = 0;
		int numeroRecibido = pPiedraPapelTijeraFactory.getNumero();
		switch(numeroRecibido) {
		case TIJERA:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " corta a " + nombre ;
			break;
		case PIEDRA:
			result = 1;
			descripcionResultado = nombre + " tapa a " + pPiedraPapelTijeraFactory.getNombre();
			break;
		case LAGARTO:
			result = -1;
			descripcionResultado = pPiedraPapelTijeraFactory.getNombre() + " devora a  " + nombre ;
			break;
		case SPOCK:
			result = 1;
			descripcionResultado = nombre + " desautoriza a  " + pPiedraPapelTijeraFactory.getNombre();
			break;
		default:
			result = 0;
			descripcionResultado = nombre + " empata con " + pPiedraPapelTijeraFactory.getNombre();
			break;
		}
		return result;
	}

}
