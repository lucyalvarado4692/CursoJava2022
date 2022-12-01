package ej14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

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
	
	public static TreeSet<Persona> ordenarPersonas(List<Persona> personasList){
		TreeSet<Persona> personasSet = new TreeSet<Persona>();
		for (Persona persona : personasList) {
			personasSet.add(persona);
		}
		return personasSet;
	}


}
