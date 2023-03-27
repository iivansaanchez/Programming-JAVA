package com.edu;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {

	String marca;
	String descripcion;
	String modelo;
	String matricula;
	Combustible combustible;
	LocalDateTime fechaEntrada;
	TipoVehiculo tipoVehiculo;
	
	public Vehiculo() {
		
	}
	
	public Vehiculo(String marca, String descripcion, String modelo, LocalDateTime fechaEntrada,
			Combustible combustible, TipoVehiculo tipo) {
		
		super();
		this.marca = marca;
		this.descripcion = descripcion;
		this.modelo = modelo;
		this.fechaEntrada = fechaEntrada;
		this.combustible=combustible;
		this.tipoVehiculo=tipo;


	}
	public String confirmarMatricula(String matricula) {
		String res = "";
		
		if(matricula.length()==7) {
			for(int i = 0; i<matricula.length(); i++) {
				if(i<=3 && Character.isDigit(matricula.charAt(i))) {
				res+=matricula.charAt(i);
				}else if(i>3 && i<=7 &&Character.isLetter(matricula.charAt(i))) {
				res+=matricula.charAt(i);
				}
			}
		}
		
		if(res.length()==7) {
			this.matricula=res;
		}else {
			res+="";
			res+="Matricula no válida.";	
		}
		return res;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public LocalDateTime getFechaEntrada() {
		return fechaEntrada;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(combustible, fechaEntrada, marca, matricula, modelo, tipoVehiculo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean esIgual = this == obj;
		
		if(!esIgual && obj!=null && obj instanceof Vehiculo) {
			Vehiculo otro = (Vehiculo) obj;
			
			esIgual = this.combustible != null && otro.combustible!=null && this.combustible.equals(otro) &&
					this.fechaEntrada != null && otro.fechaEntrada!= null && this.fechaEntrada.equals(otro) &&
					this.marca != null && otro.marca != null && this.marca.equals(otro) &&
					this.matricula != null && otro.matricula != null && this.matricula.equals(otro) &&
					this.modelo != null && otro.modelo != null && this.modelo.equals(otro) &&
					this.tipoVehiculo != null && otro.tipoVehiculo != null && this.tipoVehiculo.equals(otro);
		}
	return esIgual;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ", descripcion: " + descripcion + ", modelo: " + modelo + ", matricula: "
				+ matricula + ", combustible: " + combustible + ", fechaEntrada: " + fechaEntrada + ", tipoVehiculo: "
				+ tipoVehiculo+ "\n";
	}
/*
	@Override
	public int compareTo(Vehiculo o) {
		return this.getFechaEntrada().compareTo(o.getFechaEntrada());
	}	
 * 
 */
}
