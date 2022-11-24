/**
 * 
 */
package Figuras;

/**
 * @author lucyalva
 *
 */
public class Cuadrado extends Figura {
	
	private float lado;
	
//constructores
	public float getLado() {
		return lado;
	}


	public void setLado(float lado) {
		this.lado = lado;
	}

	public Cuadrado() {
		
	}
	

	public Cuadrado(String pNombre, float plado) {
		super(pNombre);
		this.lado = plado;
	}


	@Override
	public float calcularPerimetro() {

		return lado*4;
	}

	@Override
	public float calcularSuperficie() {

		return lado*lado;
	}


	

	@Override
	public int hashCode() {
		return super.hashCode() + (int)lado;
	}


	@Override
	public boolean equals(Object obj) {

		return super.equals(obj)&&
				obj instanceof Cuadrado &&
				((Cuadrado)obj).getLado()==lado;

	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", lado=");
		sb.append(lado);
		return sb.toString();
	}

}
