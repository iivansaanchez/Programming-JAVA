package ejercicios;

import java.util.Scanner;

/*
* Realiza un programa que sume los 100 números siguientes a un número entero y
* positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto 
* (que es un número positivo).
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		int number=1;
		System.out.println("Introduce un número: ");
		Scanner sc =  new Scanner(System.in);
		number = Integer.valueOf(sc.nextLine());
		while (number<0) {
			System.out.println("Introduce un número: ");
			number = Integer.valueOf(sc.nextLine());
		}
		int contador=0;
		int suma=0;
while(contador<100) {
			suma+=number;
			number++;
			contador++;
		}
		System.out.println(suma);
	}	

}
