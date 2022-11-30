package com.capgemini.training.java.ej2;

import java.util.ArrayList;


public class MiPila {
	// arreglo arryalist
	private static ArrayList<String> Pila;
	

	
	public static void main(String[] args) {
		
		Pila = new ArrayList<String>(); 
		Pila.add("Lucy");
		Pila.add("Patricia");
		Pila.add("Paz");
		Pila.add("Viviana");
		pop();
		push("Maria");
		peek();
		reverse();
		
	}
	
	
	  public static void reverse() { 
		  ArrayList<String> Temporal = new ArrayList<String>(); 
		  int longitudDelArreglo = Pila.size();
		  String element;
		  System.out.println(Pila); 
		  for(int index = 0; index < longitudDelArreglo; index++ ) { 
			  int indiceContrario = longitudDelArreglo - index - 1; 
			  element =Pila.get(indiceContrario); 
			  Temporal.add(element); }
		  System.out.println(Temporal);
	  
	  }
	 
	
	public static ArrayList<String> reverseTest(ArrayList<String> pArrayListTest) {
		ArrayList<String> Temporal = new ArrayList<String>();
		int longitudDelArreglo = pArrayListTest.size();
		String element;
		System.out.println(pArrayListTest);
		for(int index = 0; index < longitudDelArreglo; index++ ) {
			int indiceContrario = longitudDelArreglo - index - 1;
			element = pArrayListTest.get(indiceContrario);
			Temporal.add(element);
		}
		return Temporal;
	}
	
	  public static void peek() { 
		  int index = Pila.size()-1; 
		  String lastElement = Pila.get(index); 
		  System.out.println(lastElement);
	  }
	  
	  public static String peekTest(ArrayList<String> pArrayListTest) { 
		  int index = pArrayListTest.size()-1; 
		  String lastElement = pArrayListTest.get(index); 
		  return lastElement;
	  }
	  
	  public static void push(String string) { 
		  Pila.add(string);
		  System.out.println(Pila);
	  
	  }
	  public static ArrayList<String> pushTest(String pString, ArrayList<String> pArrayListTest) { 
		  pArrayListTest.add(pString);
		  return pArrayListTest;
	  }
	  
	  public static void pop() { 
		  int index = Pila.size()-1; 
		  Pila.remove(index);
		  System.out.println(Pila);
	  
	  }
	  public static ArrayList<String> popTest(ArrayList<String> pArrayListTest) { 
		  int index = pArrayListTest.size()-1; 
		  pArrayListTest.remove(index);
		  return pArrayListTest;
	  
	  }
	 

	
}
