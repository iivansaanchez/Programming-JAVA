package com.edu;
import java.util.Random;

public class Baraja {
	Random rd = new Random();
	
	int numCartas = 0;
	private Carta[] cartas;
	
	private static final int CARTAS_TOTALES=40;

	public Baraja() throws Exception{
		
		this.cartas= new Carta[CARTAS_TOTALES];
		int siguienteCarta=0;
		
		for(Palo p : Palo.values()) {
			for(int i = 1; i<13; i++) {
				if(i!=8 && i!=9) {
					this.cartas[siguienteCarta++]=new Carta(i, p);
				}
			}
		}

	}
	
	public void barajar() {
		
		int valorRandom1;
		int valorRandom2;
		Carta cartaQuePierdes;
		int contadorVecesBaraja=20;
		
		
		while(contadorVecesBaraja>0) {
			valorRandom1=rd.nextInt(39);
			valorRandom2=rd.nextInt(39);
			while(valorRandom1==valorRandom2) {
				valorRandom2=rd.nextInt(39);
			}
			
			cartaQuePierdes=this.cartas[valorRandom1];
			this.cartas[valorRandom1]=this.cartas[valorRandom2];
			this.cartas[valorRandom2]=cartaQuePierdes;
			
			contadorVecesBaraja--;
		}

	}

	public Carta getSiguienteCarta() {
		Carta siguienteCarta=cartas[this.numCartas];
		this.numCartas++;
		return siguienteCarta;
	}

	@Override
	public String toString() {
		return ""+this.getSiguienteCarta();
	}
	
	
	
	
	
	
	
	
}
