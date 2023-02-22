package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que pida un número por teclado y que después muestre ese número al revés.
 */
public class Ejercicio2 {
	public static void main(String[]args) {
		String number="";
		String res="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		number = String.valueOf(sc.nextLine());
		
		for (int i=number.length()-1; i>=0;i--) {
			res+=number.charAt(i);
		}
		
		System.out.println(res);
	}

}
