package com.edu;

import java.util.Arrays;

public class Parking {
	
	Vehiculo[] parking;
	int capacidad;
	int numeroCoche;
	
	public Parking(int capacidad) {
		this.capacidad=capacidad;
		parking = new Vehiculo[capacidad];
	}
	
	public void meterCoche(Vehiculo vehiculo) {
		if(numeroCoche<capacidad) {
			parking[numeroCoche]=vehiculo;
			numeroCoche++;
		}else {
			System.out.println("PARKING LLENO. METE TU COCHE EN OTRO SITIO");
		}
	}
	public void sacarCoche(Vehiculo vehiculo) {
		try {
			for(int i = 0; i < parking.length; i++) {
				if(parking[i].equals(vehiculo)) {
					parking[i]=null;
				}
			}
		} catch (Exception e) {
			System.out.println("Tiene espacios sin asignar.");
		}
		
	}
	public String mostrarInfoParking() {
		return "";
	}

	public Vehiculo[] getParking() {
		return parking;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public int getNumeroCoche() {
		return numeroCoche;
	}

	@Override
	public String toString() {
		return Arrays.toString(parking);
	}
	
	

}
