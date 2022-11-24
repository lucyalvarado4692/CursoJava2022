package com.capgemini.training.java.ej2;

import java.util.ArrayList;


public class MiPila {
	// arreglo arryalist
	
	private static ArrayList<String> Pila = new ArrayList<String>();

	
	public static void main(String[] args) {
		Pila.add("Lucy");
		Pila.add("Patricia");
		Pila.add("Paz");
		Pila.add("Viviana");
		pop();
		push("Maria");
		peek();
		reverse();
		
	}
	
	private static void reverse() {
		ArrayList<String> Temporal = new ArrayList<String>();
		int longitudDelArreglo = Pila.size();
		String element;
		System.out.println(Pila);
		for(int index = 0; index < longitudDelArreglo; index++ ) {
			int indiceContrario = longitudDelArreglo - index - 1;
			element = Pila.get(indiceContrario);
			Temporal.add(element);
		}
		System.out.println(Temporal);
		
	}

	private static void peek() {
		int index = Pila.size()-1;
		String lastElement = Pila.get(index);
		System.out.println(lastElement);
		
	}

	private static void push(String string) {
		Pila.add(string);
		System.out.println(Pila);
		
	}

	private static void pop() {
		int index = Pila.size()-1;
		Pila.remove(index);
		System.out.println(Pila);
		
	}

	
}
