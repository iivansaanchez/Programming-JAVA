package com.edu.complex.model;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU = "1. Sumar Complejos. \n"
									+ "2. Restar Complejos. \n"
									+ "3. Salir";

	public static void main(String[] args) {
		Complejo c1 = new Complejo(2.0, 4.0);
		Complejo c2 = new Complejo(5.0, 3.0);
		
		Scanner sc = new Scanner(System.in);
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		int opcion = Integer.valueOf(sc.nextLine());
		
	while(opcion>0 && opcion!=3) {
		switch (opcion) {
		case 1:
			System.out.println(c1.sumaComplejo(c2));
			break;
		case 2:
			System.out.println(c1.restaComplejos(c2));
			break;
		}
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		opcion = Integer.valueOf(sc.nextLine());
	}

	}

}
