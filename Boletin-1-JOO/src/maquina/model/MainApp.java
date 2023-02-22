package com.edu.maquina.model;

import java.util.Scanner;

public class MainApp {
	
private static final String		 MENU="1. Café --> 1€\n"
									+ "2. Leche --> 0.8€\n"
									+ "3. Café con leche --> 1.5€\n"
									+ "4. Estado máquina.\n"
									+ "5.Apagar máquina.";

public static void main(String[] args) {
	Maquina maquina = new Maquina();
	
	Scanner sc = new Scanner(System.in);
	System.out.println(MENU);
	System.out.println("Elige una opción: ");
	int opcion = Integer.valueOf(sc.nextLine());
	
	while (opcion!=5) {
		switch (opcion) {
		case 1:
			System.out.println("Introduce dinero: ");
			maquina.servirProducto("CAFE", Float.valueOf(sc.nextLine()));
			break;
		case 2:
			System.out.println("Introduce dinero: ");
			maquina.servirProducto("LECHE", Float.valueOf(sc.nextLine()));
			break;
		case 3:
			System.out.println("Introduce dinero: ");
			maquina.servirProducto("CAFE CON LECHE", Float.valueOf(sc.nextLine()));
			break;
		case 4:
			System.out.println(maquina);
			break;
		}
		System.out.println(MENU);
		System.out.println("Elige una opción: ");
		opcion = Integer.valueOf(sc.nextLine());
	}
	
}
}
