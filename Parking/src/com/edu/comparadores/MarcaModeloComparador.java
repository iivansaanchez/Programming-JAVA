package com.edu.comparadores;

import java.util.Comparator;

import com.edu.Vehiculo;

public class MarcaModeloComparador implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo o1, Vehiculo o2) {
		int resultado = 0;
		
		try {
			if(o1!=null && o2!=null) {
				resultado=o1.getMarca().compareTo(o2.getMarca());
				if(resultado==0) {
					resultado=o1.getModelo().compareTo(o2.getModelo());
				}
			}else if(o1==null) {
				resultado=-1;
			}else if(o2==null) {
				resultado=1;
			}
			
		} catch (Exception e) {
			System.out.println("Error. Vehiculo nulo.");
		}
		
		
		return resultado;
	}

}
