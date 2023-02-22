package com.edu.cuenta.model;

import java.util.Scanner;

public class Principal {
	
	public static final String MENU=  "1. Hacer reintegro. \n"
									+ "2. Hacer ingreso. \n"
									+ "3. Consultar saldo y número de operaciones. \n"
									+ "4. Finalizar operaciones";

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("¿Que saldo tienes en la cuenta?: ");
		Cuenta cuenta = new Cuenta(Double.valueOf(sc.nextLine()));
		
		String consultar="SI";
		
	while(consultar.equals("SI")) {
		
		System.out.println(MENU);
		System.out.println("Elige una opcion: ");
		int opcion = Integer.valueOf(sc.nextLine());
		
		switch (opcion) {
		case 1:
			System.out.println("¿Qué cantidad desea retirar?: ");
			cuenta.hacerReintegro(Double.valueOf(sc.nextLine()));
			break;
		case 2:
			System.out.println("¿Qué cantidad desea ingresar?: ");
			cuenta.hacerIngreso(Double.valueOf(sc.nextLine()));
			break;
		case 3:
			System.out.println(cuenta);
			break;
			}
		
		System.out.println("¿Quieres realizar más operaciones?: ");
		consultar = sc.nextLine().toUpperCase();
		}
		System.out.println(cuenta.finalizarOperaciones());
	}
}
