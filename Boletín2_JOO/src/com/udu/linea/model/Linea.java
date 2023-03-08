package com.udu.linea.model;



public class Linea {

	private Punto A;
	private Punto B;
	
	public Linea() {
		super();
		this.A=new Punto();
		this.B=new Punto();
	}
	
	public Linea(Punto A, Punto B) {
		this.A=A;
		this.B=B;
	}
	
	public void moverDerecha(Double cantMover) {
		double cantPuntoA = A.getX();
		cantPuntoA+=cantMover;
		double cantPuntoB = B.getX();
		cantPuntoB+=cantMover;
		
		A.setX(cantPuntoA);
		B.setX(cantPuntoB);
	}
	
	public void moverIzquierda(Double cantMover) {
		double cantPuntoA = A.getX();
		cantPuntoA-=cantMover;
		double cantPuntoB = B.getX();
		cantPuntoB-=cantMover;
		
		A.setX(cantPuntoA);
		B.setX(cantPuntoB);
	}
	
	public void moverArriba(Double cantMover) {
		double cantPuntoA = A.getY();
		cantPuntoA+=cantMover;
		double cantPuntoB = B.getY();
		cantPuntoB+=cantMover;
		
		A.setY(cantPuntoA);
		B.setY(cantPuntoB);
	}
	
	public void moverAbajo(Double cantMover) {
		double cantPuntoA = A.getY();
		cantPuntoA-=cantMover;
		double cantPuntoB = B.getY();
		cantPuntoB-=cantMover;
		
		A.setY(cantPuntoA);
		B.setY(cantPuntoB);
	}

	@Override
	public String toString() {
		return "[("+A.getX()+", "+A.getY()+")"+", "+"("+B.getX()+", "+B.getY()+")]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean igual = this == obj; //Si el objeto es igual al Objeto tipo Objecto es false.
		
		/*Distinto de false = true, objeto diferente de null y el tipo de obj
		 * coincide con el tipo Linea(Objeto Linea)
		 */
		if(!igual && obj != null && obj instanceof Linea) {
			
			Linea otraLinea = (Linea) obj;//Creamos un objeto otraLinea y le asignamos el obj
			
			//Comparamos punto A y B de las dos lineas
			igual = this.A != null && otraLinea.A != null && this.A == otraLinea.A
				&& this.B != null && otraLinea.B != null && this.B == otraLinea.B;
		}
		
		
		
		return igual;
	}

	public Punto getA() {
		return A;
	}

	public Punto getB() {
		return B;
	}
	
	
}
