package ej5;

public class Guitarra extends Orquesta {
	
	public String sonido;
	
	

	public Guitarra() {

	}

	public Guitarra(String pInstrumento, String pSonido) {
		super(pInstrumento);
		setSonido(pSonido);
	}



	public String sonar() {
		sonido = "Guitarra.sonar()";
		return sonido;
		
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
