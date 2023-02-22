package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que pida números y muestre su cuadrado, 
 * repitiendo el proceso hasta que se introduzca un número negativo.
 */

public class Ejercicio11 {
	
	public static void main(String[]args) {
		System.out.println("Introduce un número: ");
		Scanner sc = new Scanner(System.in);
		int number = Integer.valueOf(sc.nextLine());
		while (number>0) {
			double cuadrado=Math.sqrt(number);
			System.out.println(cuadrado);
			System.out.println("Introduce un número: ");
			number=Integer.valueOf(sc.nextLine());
		}
	}
}
