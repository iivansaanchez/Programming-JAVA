package com.udu.jarra.model;

public class Jarra {
	
	Double capacidad;
	Double cantidadAgua;
	Double totalAgua;
	
	//CONSTRUCTORES
	public Jarra() {
		super();
		this.capacidad=0.0;
		this.cantidadAgua=0.0;
	}
	
	public Jarra(double capacidad) {
		this.capacidad=capacidad;
		this.cantidadAgua=0.0;
	}
	
	//METODOS
	
	public void llenarJarra() {
		this.cantidadAgua=capacidad;
		this.totalAgua=capacidad;
	}
	
	public void vaciarJarra() {
		this.cantidadAgua-=this.capacidad;
	}
	/**
	 * En este metodo queremos volcar el liquido contenido de una jarra en otra
	 * para hacer dicha accion primero debemos comprobar que al menos una de las dos
	 * contiene liquido. Una vez hecho eso comparamos las cantidades para ver 
	 * @param jarra1
	 * @param jarra2
	 */
	public void volcarJarra(Jarra jarra1, Jarra jarra2) {
		
		if(jarra1.cantidadAgua==jarra1.capacidad ||
				jarra2.cantidadAgua==jarra2.capacidad) {
			
			if(jarra1.cantidadAgua > jarra2.cantidadAgua) {
				
				double numVecesLlena;
				double litroSobra;
				numVecesLlena=jarra1.capacidad/jarra2.capacidad;
				litroSobra=jarra1.capacidad%jarra2.capacidad;
				System.out.println("Se llena la jarra 2: "+numVecesLlena+
						" veces al completo, y le quedan dentro "+litroSobra+" litros.");
				jarra2.cantidadAgua+=jarra1.cantidadAgua;
				jarra1.cantidadAgua=0.0;
			}else if(jarra1.cantidadAgua < jarra2.cantidadAgua) {
				jarra2.cantidadAgua+=jarra1.cantidadAgua;
				jarra1.cantidadAgua=0.0;
				
			}else{
				jarra2.cantidadAgua+=jarra1.cantidadAgua;
				jarra1.cantidadAgua=0.0;
			}
		}else {
			System.out.println("No es posible vaciar una en otra.");
		}
	}
	
	
	 //GETTERS AND SETTERS

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	public double getContAgua() {
		return cantidadAgua;
	}

	public void setContAgua(Double contAgua) {
		this.cantidadAgua = contAgua;
	}

	public Double getTotalAgua() {
		return totalAgua;
	}

	
	//METODO TO_STRING
	
	@Override
	public String toString() {
		return "Tiene una capacidad de: "+capacidad+
				" y contiene "+cantidadAgua+" litros";
	}
	
	
}
