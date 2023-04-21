package generico;

import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
	
		String[] alumnos = new String[3];
		alumnos[0]="Ivan";
		alumnos[1]="José";
		alumnos[2]="Fran";
		System.out.println(Arrays.toString(reverse(alumnos)));
		
	}
	
	public static <T> T[] reverse(T[] original) {
		
		int tamanio = original.length-1;
		T[] copia = original.clone();
		
		for(int i = 0; i<original.length; i++) {
			copia[i]=original[tamanio-i];
		}
		return copia;
		
	}

}
