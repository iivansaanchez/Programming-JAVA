package com.edu.rect.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double altura;
		double base;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una altura real menor que 20: ");
		altura = Double.valueOf(sc.nextLine());
		System.out.println("Introduce una base real menor que 20: ");
		base = Double.valueOf(sc.nextLine());
		
		Rectangulo rec = new Rectangulo(altura, base);
		System.out.println(rec);
	}

}
