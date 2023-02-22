package com.edu.rect.model;

public class Rectangulo {
	
	private double longitud;
	private double ancho;
	//CONSTRUCTOR
	
	public Rectangulo() {
		super();
		this.longitud=1;
		this.ancho=1;
	}
	public Rectangulo(double longitud, double ancho) {
		this();
		this.longitud = (longitud>0 && longitud<=20)?longitud:this.longitud;
		this.ancho = (ancho>0 && ancho<=20)?ancho:this.ancho;
		
	}
	//METODOS
	public double calcularPerimetro() {
		double perimetro = 0.0;
		perimetro = (2*longitud) + (2*ancho);
		return perimetro;
	}
	
	public double calcularArea() {
		double area = 0.0;
		area = (longitud*ancho);
		return area;
	}
	
	@Override
	public String toString() {
		return "Rectangulo con altura: " + longitud + " cm y con una base de: " + ancho + " cm\n"
				+"el perimetro del triangulo es: "+ calcularPerimetro()+" cm\n"
				+ "y el area es: " + calcularArea()+ " cm";
	}
	//GETTERS AND SETTERS
	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		if(longitud>0 && longitud<=20) {
			this.longitud = longitud;	
		}
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if(ancho>0 && ancho<=20) {
			this.ancho = ancho;	
		}
	}
}
