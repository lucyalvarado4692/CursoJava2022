package string;

public class StringExample {

	public static void main(String[] args) {
		String saludos[] = {
				new String("hola"),
				new String("adios"),
				new String("hello"),
				new String("goodbye")
		};
		
		String tmp = saludos[2];
		tmp = saludos[2].toUpperCase();
		
		for(int index=0; index < saludos.length; index++) {
			System.out.println("la posición" + index + "tiene el valor" + saludos[index]);
		}
		
		

	}

}
