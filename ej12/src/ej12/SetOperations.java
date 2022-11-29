package ej12;

import java.util.Set;
import java.util.TreeSet;


public class SetOperations<T>{
	
	public static void main(String[] args) {
        Set<String> a = new TreeSet<>();
        Set<String> b = new TreeSet<>();
        
        a.add("Patricia");
		a.add("Lucy");
		a.add("Paz");
		a.add("Cristina");
		a.add("Viviana");
		a.add("Nerea");
		b.add("Gabriel");
		b.add("Patricia");
		b.add("Lucy");
		b.add("Paz");
		b.add("Cristina");
		b.add("Maria");
        
        Set<String> cGen = union(a, b);
        System.out.println("Union: " + cGen);
        
        cGen = interseccion(a, b);
        System.out.println("Interseccion: " + cGen);
        
        cGen = diferencia(a, b);
        System.out.println("Diferencia: " + cGen);
        
        cGen = difSimetrica(a, b);
        System.out.println("Diferencia simétrica: " + cGen);
	}
	
	
	public static <T> Set<T> union(Set<T> setA, Set<T> setB){
		Set<T> res = new TreeSet<>(setA);
        res.addAll(setB);
        return res;
		
	}
	
	public static <T> Set<T>interseccion(Set<T> setA, Set<T> setB){
		Set<T> res = new TreeSet<>(setA);
        res.retainAll(setB);
        return res;
		
	}
	public static <T> Set<T>diferencia(Set<T> setA, Set<T> setB){
		Set<T> res = new TreeSet<>(setA);
        res.removeAll(setB);
        return res;
		
	}
	public static <T> Set<T>difSimetrica(Set<T> setA, Set<T> setB){
		Set<T> res = diferencia(setA,setB);
        Set<T> bmenosa = diferencia(setB,setA);
        res.addAll(bmenosa);
        return res;
		
	}

}
