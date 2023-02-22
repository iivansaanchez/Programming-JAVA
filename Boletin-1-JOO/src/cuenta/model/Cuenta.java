package com.edu.cuenta.model;

public class Cuenta {

	private double saldo;
	private int numIngresos;
	private int numReintegros;
	
	public Cuenta() {
		super();
		this.saldo=0;
		this.numIngresos=0;
		this.numReintegros=0;
	}
	
	public Cuenta(double saldo) {
		this();
		this.saldo=saldo;
	}
	
	public boolean hacerReintegro(double cantRetirar) {
		boolean res = false;
		
		res=(cantRetirar<=saldo)?true:false;
		
		if(res==true) {
			saldo-=cantRetirar;
			numReintegros++;
		}
		return res;
	}
	
	public boolean hacerIngreso(double cantIngresar) {
		boolean res = false;
		res=(cantIngresar>0)?true:false;
		
		if(res==true) {
			saldo+=cantIngresar;
			numIngresos++;
		}
		return res;
	}

	@Override
	public String toString() {
		return "En la cuenta se han realizado: " + numIngresos + " ingresos"+"\n"
				+"y " + numReintegros + " reintegros";
	}
	
	public String finalizarOperaciones() {
		String res="";
		res+="El saldo después de todas las operaciones es: "+saldo;
		return res;
	}
	
	
}
