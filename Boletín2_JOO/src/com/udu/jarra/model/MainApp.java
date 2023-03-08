package com.udu.jarra.model;

import java.util.Scanner;

public class MainApp {
	
	private static final String MENU = "1. Llenar jarra. \n"
										+ "2. Vaciar jarra. \n"
										+ "3. Volcar jarra A en B. \n"
										+ "4. Volcar jarra B en A. \n"
										+ "5. Ver estado de jarras. \n"
										+ "6. Salir";
	
	public static void main(String[] args) {
		Double capacidad;
		Integer opcion;
		String opcionLetra;
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Capacidad para la jarra: ");
			capacidad=Double.valueOf(sc.nextLine());
			Jarra a = new Jarra(capacidad);
			System.out.println("Capacidad para la jarra: ");
			capacidad=Double.valueOf(sc.nextLine());
			Jarra b = new Jarra(capacidad);
			
		System.out.println(MENU);
		System.out.println("Elige una opción: ");
		opcion=Integer.valueOf(sc.nextLine());
		
while(opcion>0 && opcion!=6) {
	
		switch (opcion) {
		case 1:
			System.out.println("¿Que jarra desea llenar (A/B)?");
			opcionLetra=sc.nextLine().toUpperCase();
			
			switch (opcionLetra) {
			case "A":
				a.llenarJarra();
				break;
			case "B":
				b.llenarJarra();
				break;
			}
			
			break;
			
		case 2:
			System.out.println("¿Que jarra desea vaciar (A/B)?");
			opcionLetra=sc.nextLine().toUpperCase();
			
			switch (opcionLetra) {
			case "A":
				a.vaciarJarra();
				break;
			case "B":
				b.vaciarJarra();
				break;
			}
			
			break;
		case 3:
			a.volcarJarra(a, b);
			break;
		case 4:
			b.volcarJarra(b, a);
			break;
			
		case 5:
			System.out.println(a);
			System.out.println(b);
			break;
		}
		System.out.println(MENU);
		System.out.println("Elige una opción: ");
		opcion=Integer.valueOf(sc.nextLine());
	}
}
}
