package ej5;

public abstract class InstrumentosMusicales {
	
	String nombre;

	public InstrumentosMusicales() {
		super();
	}

	public InstrumentosMusicales(String pNombre) {
		super();
		this.nombre = pNombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String getSonidoDelInstrumento();


}
