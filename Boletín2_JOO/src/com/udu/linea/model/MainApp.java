package com.udu.linea.model;

import java.util.Scanner;


public class MainApp {
	private static final String MENU = 		"1. Mover línea. \n"
											+ "2. Mostrar línea. \n"
											+ "3. Salir";
	
	private static final String MENU2 = "A. Arriba \n"
										+ "B. Abajo \n"
										+ "I. Izquierda \n"
										+ "D. Derecha \n";
			
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Integer opcion = 0;
		Punto A = new Punto();
		Punto B = new Punto();
		double valorCoordenadas = 0.0;
		
		//CREAR PUNTO A
		System.out.println("Introduce una coordenada X: ");
		valorCoordenadas=Double.valueOf(sc.nextLine());
		A.setX(valorCoordenadas);
		System.out.println("Introduce una coordenada Y: ");
		valorCoordenadas=Double.valueOf(sc.nextLine());
		A.setY(valorCoordenadas);
		//CREAR PUNTO B
		System.out.println("Introduce una coordenada X: ");
		valorCoordenadas=Double.valueOf(sc.nextLine());
		B.setX(valorCoordenadas);
		System.out.println("Introduce una coordenada Y: ");
		valorCoordenadas=Double.valueOf(sc.nextLine());
		B.setY(valorCoordenadas);
		//ASIGNAR PUNTO A LA LINEA
		Linea linea = new Linea(A, B);

		System.out.println(MENU);
		System.out.println("Introduce una opcion: ");
		opcion=Integer.valueOf(sc.nextLine());
		
		double mover = 0.0;//Variable a la que le vamos a asignar el movimiento
		
	while(opcion>0 && opcion!=3) {
		
		switch (opcion) {
		case 1:
			String opcion2 = "";
			System.out.println(MENU2);
			System.out.println("Introduce una opcion: ");
			opcion2=sc.nextLine().toUpperCase();
			
			switch (opcion2) {
			case "A":
				System.out.println("Número para mover arriba: ");
				mover=Double.valueOf(sc.nextLine());
				linea.moverArriba(mover);
				break;
				
			case "B":
				System.out.println("Número para mover abajo: ");
				mover=Double.valueOf(sc.nextLine());
				linea.moverAbajo(mover);
				break;
			case "I":
				System.out.println("Número para mover derecha: ");
				mover=Double.valueOf(sc.nextLine());
				linea.moverIzquierda(mover);
				break;
			case "D":
				System.out.println("Número para mover derecha: ");
				mover=Double.valueOf(sc.nextLine());
				linea.moverDerecha(mover);
				break;
			}
			break;
			
		case 2:
			System.out.println(linea);
			break;
		}
		System.out.println(MENU);
		System.out.println("Introduce una opcion: ");
		opcion=Integer.valueOf(sc.nextLine());
	}

	}
}
