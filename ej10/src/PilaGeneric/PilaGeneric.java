package PilaGeneric;

import java.util.ArrayList;
import java.util.List;

public class PilaGeneric<T> {

	List<T> pila;
	
	public List<T> reverse(List<T> pArrayListTest) {
		List<T> Temporal = new ArrayList<T>();
		int longitudDelArreglo = pArrayListTest.size();
		T element;
		System.out.println(pArrayListTest);
		for(int index = 0; index < longitudDelArreglo; index++ ) {
			int indiceContrario = longitudDelArreglo - index - 1;
			element = pArrayListTest.get(indiceContrario);
			Temporal.add(element);
		}
		return Temporal;
	}

	
	
	public void push(T e){ 
		pila.add(e); 
		}
	
	public List<T> pop(List<T> pArrayListTest) { 
		  int index = pArrayListTest.size()-1; 
		  pArrayListTest.remove(index);
		  return pArrayListTest;
	  
	  }
	
	public T peekTest(List<T> pArrayListTest) { 
		  int index = pArrayListTest.size()-1; 
		  T lastElement = pArrayListTest.get(index); 
		  return lastElement;
	  }
	
	/*
	 * private List<T> list=new ArrayList<T>();
	 * 
	 * 
	 * 
	 * 
	 * public T pop() { T ultimo = list.remove(list.size() - 1); return ultimo; }
	 * 
	 * public void push(T e){ list.add(e); }
	 * 
	 * public T peek() { T mostrarUltimo = list.get(list.size()-1); return
	 * mostrarUltimo; }
	 * 
	 * public void reverse() { ArrayList<T> list2 = new ArrayList<T>(); int index =
	 * list.size(); for (int i = 0; i < index; i++) {
	 * list2.add(list.remove(list.size() - 1)); } list = list2; } public List<T>
	 * getList() { return list; }
	 */

}
