package com.edu.complex.model;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU = "1. Sumar Complejos. \n"
									+ "2. Restar Complejos. \n"
									+ "3. Salir";

	public static void main(String[] args) {
		Complejo complejo = new Complejo(4, "4i", 4, "4i");
		Scanner sc = new Scanner(System.in);
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		int opcion = Integer.valueOf(sc.nextLine());
		
	while(opcion>0 && opcion!=3) {
		switch (opcion) {
		case 1:
			System.out.println(complejo.sumaComplejo());
			break;
		case 2:
			System.out.println(complejo.restaComplejos());
			break;
		}
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		opcion = Integer.valueOf(sc.nextLine());
	}

	}

}
