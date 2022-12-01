package PilaGeneric;

import java.util.ArrayList;
import java.util.List;

public class PilaGeneric<T> {

	List<T> pila =new ArrayList<T>();
	
	public void reverse() {
		List<T> Temporal = new ArrayList<T>();
		int longitudDelArreglo = pila.size();
		T element;
		for(int index = 0; index < longitudDelArreglo; index++ ) {
			int indiceContrario = longitudDelArreglo - index - 1;
			element = pila.get(indiceContrario);
			Temporal.add(element);
		}
		pila = Temporal;
	}

	public void push(T e){ 
		pila.add(e); 
		}
	
	public List<T> pop() { 
		  int index = pila.size()-1; 
		  pila.remove(index);
		  return pila;
	  
	  }
	
	public T peek() { 
		  int index = pila.size()-1; 
		  T lastElement = pila.get(index); 
		  return lastElement;
	  }
	
	public List<T> getList() {
		return pila;
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
