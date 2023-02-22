package com.edu.aero.model;

import java.util.Scanner;

public class Principal {
	
public static final String MENU = "Elige una opcion: \n"
			+ "a.) Asignar Vuelo. \n"
			+ "b.) Obtener el número de vuelos: \n"
			+ "c.) Obtener el número de kilometros: \n"
			+ "d.) Obtener la media de kilometros por vuelo: \n"
			+ "e.) Cambio de compañía: \n"
			+ "f.) Mostrar información del avión: \n"
			+ "g.) Salir.";

public static void main(String[] args) {
	Avion avion;
	Scanner sc = new Scanner(System.in);
		
	int opcion=0;
		
	System.out.println("Elige una opción: ");
	opcion = Integer.valueOf(sc.nextLine());
	int capacidad = 0;
		
	if(opcion==2) {
		System.out.println("Introduce la capacidad: ");
		capacidad=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un id de avión: ");
		avion =  new Avion(sc.nextLine(), capacidad, null);
		System.out.println("Introduce una compañia: ");
		avion.setCompannia(sc.nextLine());
	}else {
		System.out.println("Introduce la capacidad: ");
		capacidad=Integer.valueOf(sc.nextLine());
		System.out.println("Introduce un id de avión: ");
		avion = new Avion(sc.nextLine(), capacidad);
	}
		
	String opcion2="";
	System.out.println(MENU);
	System.out.println("Elige una opción: ");
	opcion2=sc.nextLine().toUpperCase();
	
while(!opcion2.equalsIgnoreCase("G"))	{
	switch (opcion2) {
	case "A":
		double km=0.0;
		int numPasajero=0;
		boolean res=false;
		
		System.out.println("Introduce los kilometros a recorrer: ");
		km=Double.valueOf(sc.nextLine());
		
		System.out.println("Introduce número de pasajeros: ");
		numPasajero=Integer.valueOf(sc.nextLine());
		
		avion.asignarVuelo(numPasajero, km);
		
		if(numPasajero<=avion.getCapacidad()) {
			res=true;
		}
		System.out.println(res);
		break;
	case "B":
		System.out.println(avion.getNumeroVuelos());
		break;
	case "C":
		System.out.println(avion.getTotalKm());
		break;
	case "D":
		System.out.println(avion.getMediaKm());
		break;
	case "E":
		System.out.println("Introduce una nueva compañia: ");
		avion.setCompannia(sc.nextLine());
		break;
	case "F":
		System.out.println(avion);
		break;
	}
	System.out.println(MENU);
	System.out.println("Elige una opción: ");
	opcion2=sc.nextLine().toUpperCase();
}
}
}
