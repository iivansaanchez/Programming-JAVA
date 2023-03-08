package com.udu.liga.model;

public class MainApp {
	
	public static void main(String[] args) {
		Equipo equipoA = new Equipo("Benito Villamarin", "Sevilla", "Real Betis Balompie");
		Equipo equipoB = new Equipo("Ramon Sánchez-Pizjuan", "Sevilla", "Sevilla FC");
		Equipo equipoC = new Equipo("Santiago Bernabéu", "Madrid", "Real Madrid");
		Equipo equipoD = new Equipo("Camp Nou", "Barcelona", "FC Barcelona");
		
		Partido derbi = new Partido(14, equipoA, equipoB);
		derbi.ponerResultado("2-1");
		System.out.println(derbi);
		Partido clasico = new Partido(19, equipoD, equipoC);
		clasico.ponerResultado("1-2");
		System.out.println(clasico);
		Partido extra = new Partido(17, equipoA, equipoD);
		extra.ponerResultado("0-0");
		System.out.println(extra);
		
		System.out.println(equipoA);
		System.out.println(equipoB);
		System.out.println(equipoC);
		System.out.println(equipoD);
		
		
		

		
		
	}
}
	