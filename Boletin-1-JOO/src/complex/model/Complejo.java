package com.edu.complex.model;

public class Complejo {
	
private double real;
private double imaginaria;


public Complejo() {
	super();
}

public Complejo(double parteReal, double parteImagin) {
	this.real=parteReal;
	this.imaginaria=parteImagin;

}

public Complejo sumaComplejo(Complejo numSuma2) {
	
	Complejo suma = new Complejo();
	suma.setReal(this.real+numSuma2.getReal());
	suma.setImaginaria(this.imaginaria+numSuma2.getImaginaria());
	
	return suma;
}

public Complejo restaComplejos(Complejo numResta) {
	
	Complejo resta = new Complejo();
	if(this.real>numResta.getReal()) {
		resta.setReal(this.real-numResta.getReal());
	}else {
		resta.setReal(numResta.getReal()-this.real);
	}
		
	if(this.imaginaria>numResta.getImaginaria()) {
			resta.setImaginaria(this.imaginaria-numResta.getImaginaria());
	}else {
			resta.setImaginaria(numResta.getImaginaria()-this.imaginaria);
	}
		
	
	return resta;
}
public String mostrarInformacionComplejo(double a, char b) {
	String res = "Parte real --> "+a+"\n"
				+ "Parte Imaginaria --> "+b;
	return res;
}

public double getReal() {
	return real;
}

public void setReal(double real) {
	this.real = real;
}

public double getImaginaria() {
	return imaginaria;
}

public void setImaginaria(double imaginaria) {
	this.imaginaria = imaginaria;
}

@Override
public String toString() {
	return getReal()+" "+"+"+" "+getImaginaria()+"i";
}
}
