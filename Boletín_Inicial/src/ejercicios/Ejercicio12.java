package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que pida números hasta que se teclee uno negativo y 
 * muestre cuántos números se han introducido.
 */

public class Ejercicio12 {

	public static void main (String[]args) {
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int number = Integer.valueOf(sc.nextLine());
		int contador=0;
		while (number>0) {
			contador++;
			System.out.println("Introduce un número: ");
			number = Integer.valueOf(sc.nextLine());
		}
		System.out.println("Haz introducido "+contador+" número/s.");
	}
}
