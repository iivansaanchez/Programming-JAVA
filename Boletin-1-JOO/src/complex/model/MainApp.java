package com.edu.complex.model;

public class MainApp {

	public static void main(String[] args) {
		Complejo c1 = new Complejo(2.0, 4.0);
		Complejo c2 = new Complejo(5.0, 3.0);
		
		System.out.println(c1.sumaComplejo(c2));
		System.out.println(c1.restaComplejos(c2));
		
	}

}
