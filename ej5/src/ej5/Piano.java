package ej5;

public class Piano extends Orquesta {
private String sonido;
	
	

	public Piano() {

	}

	public Piano(String pInstrumento, String pSonido) {
		super(pInstrumento);
		setSonido(pSonido);
	}



	@Override
	public String sonar() {
		sonido = "Piano.sonar()";
		return sonido;
		
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}


}
