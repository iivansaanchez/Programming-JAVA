package com.edu;

import java.util.Scanner;

public class MainApp {
	
	private static final String MENU="1. Jugar 7 y Media. \n"
									+ "2. Salir";

	public static void main(String[] args) throws Exception {
		Baraja espaniola = new Baraja();
		espaniola.barajar();
		Scanner sc = new Scanner(System.in);
		
		double puntosJugadorA=0;
		double puntosJugadorB=0;
		
		int opcionMenu;
		
		System.out.println(MENU);
		System.out.println("Elige una opcion del menu de juego: ");
		opcionMenu=Integer.valueOf(sc.nextLine());
		
		switch (opcionMenu) {
		case 1:
			int contadorJugadores=1;
			String masCarta;
			
			while (contadorJugadores<=2){
				if(contadorJugadores==1) {
					System.out.println("Jugador1: ");
					
					Carta j1 = espaniola.getSiguienteCarta();
					puntosJugadorA+=j1.getValor();
					System.out.println(j1);
					
					System.out.println("Quieres más cartas?: ");
					masCarta=sc.nextLine().toUpperCase();
					
					if(masCarta.equals("NO")) {
						contadorJugadores++;
						System.out.println("Jugador1 tiene: "+puntosJugadorA+" puntos");
					}
				}else {
					
					System.out.println("Jugador2: ");
					
					Carta j1 = espaniola.getSiguienteCarta();
					puntosJugadorB+=j1.getValor();
					System.out.println(j1);
					
					System.out.println("Quieres más cartas?: ");
					masCarta=sc.nextLine().toUpperCase();
					
					if(masCarta.equals("NO")) {
						contadorJugadores++;
						System.out.println("Jugador2 tiene: "+puntosJugadorB+" puntos");
					}
				}
			}
			if(puntosJugadorA<puntosJugadorB && puntosJugadorA>7.5
					||puntosJugadorA>puntosJugadorB && puntosJugadorA<7.5) {
				System.out.println("Gana el jugador 1.");
			}else if(puntosJugadorB<puntosJugadorA && puntosJugadorB>7.5
					||puntosJugadorB>puntosJugadorA && puntosJugadorB<7.5) {
				System.out.println("Gana el jugador 2.");
			}else {
				System.out.println("Han quedado empate.");
			}
			break;
		default:
			break;
		}
	}
}
