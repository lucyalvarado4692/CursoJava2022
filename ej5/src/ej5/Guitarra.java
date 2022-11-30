package ej5;

public class Guitarra extends InstrumentosMusicales {
	
	private String sonido;

	public Guitarra() {
		
	}

	public Guitarra(String pNombre, String pSonido) {
		super(pNombre);
		setSonido(pSonido);
	}
	public Guitarra(String pSonido) {
		super();
	}

	@Override
	public String getSonidoDelInstrumento() {
		String sonidoDelInstrumento = "Guitarra.sonar()";
		sonido = sonidoDelInstrumento;
		return sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

}
