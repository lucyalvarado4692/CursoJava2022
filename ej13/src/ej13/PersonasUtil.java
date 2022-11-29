package ej13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class PersonasUtil {

	public static Map<Integer, Persona> getPersonas(List<Persona> pListPersonas){
		Map<Integer, Persona> mapPersonas = new HashMap<Integer, Persona>();
		Iterator<Persona> it = pListPersonas.iterator();
		while (it.hasNext()) {
			Persona persona2 = (Persona) it.next();
			mapPersonas.put(persona2.getLegajo(), persona2);
		}
		return mapPersonas;
	}
	public ordenarPersonas(List<Persona> pListPersonas){
		return 
		
	}


}
