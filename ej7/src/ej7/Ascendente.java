package ej7;

public class Ascendente {

	public static void main(String[] args) {
		
		int a[] = {20,40,30,60,50};
		System.out.println("Arreglo sin orden");
		for(int num : a) {
			System.out.println(num);
		}
		System.out.println("Orden Ascendente");
		
		for(int index = 0; index < a.length - 1; index++) {
			int min = index;
			for(int j = index +1; j<a.length; j++ ) {
				if(a[j]<a[min]) {
					min = j;
				}
			}
			if(index !=min) {
				int aux = a[index];
				a[index] = a[min];
				a[min]= aux;
			}
		}
		for(int num : a) {
			System.out.println(num);
		}

	}

}
