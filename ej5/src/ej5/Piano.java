package ej5;

public class Piano extends InstrumentosMusicales {
	
	private String sonido;

	public Piano() {
		
	}

	public Piano(String pNombre , String pSonido) {
		super(pNombre);
		setSonido(pSonido);
	}
	
	public Piano(String pSonido) {
		super();
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String getSonidoDelInstrumento() {
		String sonidoDelInstrumento = "Piano.sonar()";
		sonido = sonidoDelInstrumento;
		return sonido;
	}

}
