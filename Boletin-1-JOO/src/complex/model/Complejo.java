package com.edu.complex.model;

import java.util.Objects;

public class Complejo {
	
double parteReal;
String parteImagin;

double parteReal2;
String parteImagin2;

public Complejo() {
	super();
	this.parteReal=0.0;
	this.parteImagin="";
	
	this.parteReal2=0.0;
	this.parteImagin2="";
}

public Complejo(double parteReal, String parteImagin, double parteReal2, String parteImagin2) {
	this.parteReal=parteReal;
	this.parteReal2=parteReal2;
	this.parteImagin=parteImagin;
	this.parteImagin2=parteImagin2;
}

public String sumaComplejo() {
	String resSuma="";
	Double sumaReal = parteReal+parteReal2;
	Double sumaImagin;
	Double numeroImagin=0.0;
	String letra="";
	Double numeroImagin2=0.0;
	String letra2="";
	
	for(int i =0; i<parteImagin.length();i++) {
		if(i==0) {
			numeroImagin=Double.valueOf(Character.getNumericValue(parteImagin.charAt(i)));
		}else {
			letra+=parteImagin.charAt(i);
		}
	}
	resSuma+=String.valueOf(sumaReal+" "+"+"+" ");
	
	for(int j =0; j<parteImagin2.length();j++) {
		if(j==0) {
			numeroImagin2=Double.valueOf(Character.getNumericValue(parteImagin2.charAt(j)));
		}else {
			letra2+=parteImagin2.charAt(j);
		}
	}
	sumaImagin=Double.valueOf(numeroImagin + numeroImagin2);
	resSuma+=String.valueOf(sumaImagin);
	
	resSuma+= (letra.equals(letra2))? letra: letra+""+letra2;
	
	return resSuma;
}

public String restaComplejos() {
	
	String resResta="";
	Double restaReal = parteReal-parteReal2;
	Double restaImagin;
	Double numeroImagin=0.0;
	String letra="";
	Double numeroImagin2=0.0;
	String letra2="";
	
	
	restaReal = (parteReal>parteReal2 || parteReal==parteReal2)? parteReal-parteReal2:parteReal2-parteReal;
	
	for(int i =0; i<parteImagin.length();i++) {
		if(i==0) {
			numeroImagin=Double.valueOf(Character.getNumericValue(parteImagin.charAt(i)));
		}else {
			letra+=parteImagin.charAt(i);
		}
	}
	resResta+=String.valueOf(restaReal+" "+"-"+" ");
	
	for(int j =0; j<parteImagin2.length();j++) {
		if(j==0) {
			numeroImagin2=Double.valueOf(Character.getNumericValue(parteImagin2.charAt(j)));
		}else {
			letra2+=parteImagin2.charAt(j);
		}
	}
	if(numeroImagin>numeroImagin2) {
		restaImagin=Double.valueOf(numeroImagin - numeroImagin2);
		resResta+=String.valueOf(restaImagin);
	}else if (numeroImagin2>numeroImagin) {
		restaImagin=Double.valueOf(numeroImagin2 - numeroImagin);
		resResta+=String.valueOf(restaImagin);
	}else {
		resResta+=" ";
	}
	
	resResta+= (letra.equals(letra2))? letra: letra+""+letra2;
	
	return resResta;
}
public String mostrarInformacionComplejo(double a, char b) {
	String res = "Parte real --> "+a+"\n"
				+ "Parte Imaginaria --> "+b;
	return res;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Complejo other = (Complejo) obj;
	return (parteImagin == other.parteImagin && parteReal == other.parteReal) ||
			(parteImagin2 == other.parteImagin2 && parteReal2 == other.parteReal2);

}
}
