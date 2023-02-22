package ejercicios;

import java.util.Scanner;

/*
 * Método que pida 5 números e imprima si alguno es múltiplo de 3.
 */

public class Ejercicio9 {
	public static void main(String[]args) {
		System.out.println(multiplo3());
	}
	public static String multiplo3() {
		String mes="";
		for (int i =0; i<5; i++) {
			System.out.println("Introduce un número: ");
			Scanner sc = new Scanner(System.in);
			int numero = Integer.valueOf(sc.nextLine());
			if (numero%3==0) {
				mes+="El número "+numero+" es mútiplo de 3. \n";
			}
		}
		return mes;
	}
}
