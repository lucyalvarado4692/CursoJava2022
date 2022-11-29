package ej5;

public abstract class Orquesta {
	
	public static String instrumento;
	public abstract String sonar();
	
	
	public static void main(String[] args) {
		
		System.out.println(instrumento);
	}
	
	public Orquesta() {
		super();
	}

	public Orquesta(String pInstrumento) {
		this();
		this.setInstrumento(pInstrumento);
	}
	


	public String getInstrumento() {
		return instrumento;
	}

	@SuppressWarnings("static-access")
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}


}
