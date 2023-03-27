package com.edu;

import java.time.LocalDateTime;
import java.util.Arrays;

import com.edu.comparadores.FechaEntradaComparador;
import com.edu.comparadores.MarcaModeloComparador;
import com.edu.comparadores.MatriculaComparador;
import com.edu.comparadores.TipoYCombustibleComparador;

public class MainApp {

	public static void main(String[] args) {
		
		String combustible1 = "Gasoil".toUpperCase();
		String combustible2 = "Gasolina".toUpperCase();
		String combustible3 = "Electrico".toUpperCase();
		
		String tipo = "Automovil".toUpperCase();
		String tipo2 = "Transporte_colectivo".toUpperCase();
		
		Parking nervionPlaza= new Parking(50);
		
		Vehiculo a = new Vehiculo("Renault", "Turismo", "Clio RS", LocalDateTime.of(2015, 12, 12, 14, 20),
				Combustible.valueOf(combustible1), TipoVehiculo.valueOf(tipo) );
		Vehiculo b = new Vehiculo("BMW", "Turismo", "320d", LocalDateTime.of(2010, 12, 12, 14, 20),
				Combustible.valueOf(combustible2), TipoVehiculo.valueOf(tipo) );
		Vehiculo c = new Vehiculo("Mercedes", "Turismo", "Vito", LocalDateTime.of(2002, 12, 12, 14, 20),
				Combustible.valueOf(combustible3), TipoVehiculo.valueOf(tipo2) );
		
		a.confirmarMatricula("1234ABC");
		b.confirmarMatricula("4321CBA");
		c.confirmarMatricula("8792AVC");
		
		nervionPlaza.meterCoche(a);
		nervionPlaza.meterCoche(b);
		nervionPlaza.meterCoche(c);
		
		System.out.println("Coches ordenados por fecha: ");
		Arrays.sort(nervionPlaza.getParking(), new FechaEntradaComparador());
		System.out.println(Arrays.toString(nervionPlaza.getParking()));
		
		System.out.println("------------------------------");

		System.out.println("Coches ordenados por marca: ");
		Arrays.sort(nervionPlaza.getParking(), new MarcaModeloComparador());
		System.out.println(Arrays.toString(nervionPlaza.getParking()));
		
		System.out.println("------------------------------");
		
		System.out.println("Coches ordenador por Matricula: ");
		Arrays.sort(nervionPlaza.getParking(),new MatriculaComparador());
		System.out.println(Arrays.toString(nervionPlaza.getParking()));
		
		System.out.println("------------------------------");
		
		System.out.println("Coches ordenador por tipo y combustible: ");
		Arrays.sort(nervionPlaza.getParking(), new TipoYCombustibleComparador());
		System.out.println(Arrays.toString(nervionPlaza.getParking()));
		
		
		
		
	}

}
