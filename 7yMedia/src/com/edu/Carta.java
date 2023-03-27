package com.edu;

import java.util.Objects;

public class Carta {
	
	private Integer numeroCarta;
	private Palo palo;
	
	
	public Carta(int numeroCarta, Palo palo) {
		super();
		this.numeroCarta = numeroCarta;
		this.palo = palo;
	}
	
	public double getValor() {
		double resultado;
		if(this.numeroCarta>7) {
			resultado=0.5;
		}else {
			resultado=this.numeroCarta;
		}
		return resultado;
	}


	public int getNumeroCarta() {
		return numeroCarta;
	}


	public Palo getPalo() {
		return palo;
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = this == obj;
		
		if(!igual && obj != null && obj instanceof Carta) {
			Carta otraCarta = (Carta) obj;
			
			igual = this.numeroCarta != null && otraCarta.numeroCarta != null && this.numeroCarta==otraCarta.numeroCarta
					&& this.palo != null && otraCarta.palo != null && this.palo.equals(otraCarta.palo);
		}
		return igual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCarta, palo);
	}
	
	@Override
	public String toString() {
		return this.numeroCarta+" de "+ this.palo;
	}
	
	
	
	

}
