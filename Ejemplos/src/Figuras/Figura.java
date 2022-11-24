package Figuras;
/**
 * 
 * @author lucyalva
 *
 */

public abstract class Figura {
	private String nombre;
	private static int cantidadDeFiguras;

	//constructores
	public Figura() {
		super();
		cantidadDeFiguras++;
	}

	public Figura(String nombre) {
		this();
		this.nombre = nombre;
	}

	//accesos
	
	/**
	 * obtienen el nombre de la figura
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getCantidadDefiguras() {
		return cantidadDeFiguras;
	}
	public static void clear() {
		cantidadDeFiguras = 0;
	}
	
	//metodos de negocio
	public abstract float calcularPerimetro();
	public abstract float calcularSuperficie();

	@Override
	public int hashCode() {
		return nombre==null?0:nombre.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		boolean bln = false;
		if(obj instanceof Figura) {
			Figura fig =(Figura)obj;
			bln = fig.getNombre() !=null &&
					fig.getNombre().equals(nombre);
		}
		return bln;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nnombre=");
		sb.append(nombre);
		return sb.toString();
	}
	

}
