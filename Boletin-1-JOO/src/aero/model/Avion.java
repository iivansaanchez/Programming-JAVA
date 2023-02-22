package com.edu.aero.model;

public class Avion {
	
	private String idAvion;
	private Integer capacidad;
	private int numVuelos;
	private double kmVolados;
	private String compannia;

	public Avion() {
		super();
	}
	public Avion(String idAvion, Integer capacidad) {
		super();
		this.idAvion=idAvion;
		this.capacidad=capacidad;
		this.numVuelos=0;
		this.kmVolados=0.0;
	}
	
	public Avion(String idAvion, Integer capacidad, String compannia) {
		this(idAvion, capacidad);
		this.compannia=compannia;
	}
	

	public boolean asignarVuelo(Integer numPasajeros, Double kilometros) {
		boolean res = false;
		if(capacidad>=numPasajeros && capacidad > 0
				&& kilometros > 0) {
			res=true;
			this.kmVolados+=kilometros;
			this.numVuelos++;
		}
	return res;
	}
	
	public int getNumeroVuelos() {
		return numVuelos;
	}
	
	public double getTotalKm(){
		return kmVolados;
	}
	
	public double getMediaKm() {
		double media;
		media=kmVolados/numVuelos;
		return media;
	}
	
	
	
	
	/*GETTERS AND SETTERS*/

	public String getCompannia() {
		return compannia;
	}

	public void setCompannia(String compannia) {
		this.compannia = compannia;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public Double getKmVolados() {
		return kmVolados;
		
	}
	@Override
	public String toString() {
		return "\nAvion con id: " + idAvion + ", de la compañia: " + compannia + "\n"
				+ "con un total de: " + numVuelos + " vuelos, con un recorrido de: \n"
				+ kmVolados + " km y una media de kilometros de: " + getMediaKm()+"\n";
	}
}
