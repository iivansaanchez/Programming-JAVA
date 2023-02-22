package com.edu.complex.model;

public class MainApp {

	public static void main(String[] args) {
		Complejo complejo = new Complejo(5, "5i", 7, "6j");

		System.out.println(complejo.sumaComplejo());
		System.out.println(complejo.restaComplejos());
		System.out.println(complejo.mostrarInformacionComplejo(5, 'i'));
		
	}

}
