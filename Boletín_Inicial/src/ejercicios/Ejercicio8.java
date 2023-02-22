package ejercicios;

import java.util.Scanner;

/*
 * Método que pida 15 números y realice su suma.
 */

public class Ejercicio8 {
	
	public static void main(String[] args ) {
		System.out.println(suma());
	}

	public static int suma() {
		int suma=0;
		for (int i=0; i<15; i++) {
			System.out.println("Introduce un número: ");
			Scanner sc = new Scanner(System.in);
			int res= Integer.valueOf(sc.nextLine());
			suma+=res;
		}
		return suma;
	}

}
