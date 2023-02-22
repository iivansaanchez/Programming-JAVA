package com.edu.maquina.model;

public class Maquina {

private static final double       PRECIO_CAFE=1.0;
private static final double       PRECIO_LECHE=0.8;
private static final double       PRECIO_CAFECONLECHE=1.5;

private int depositoCafe;
private int depositoLeche;
private int depositoVaso;
private double monedero;

public Maquina() {
	super();
	this.depositoCafe=50;
	this.depositoLeche=50;
	this.depositoVaso=80;
	this.monedero=20;
}

public void llenarDeposito() {
	setDepositoCafe(depositoCafe);
	setDepositoLeche(depositoLeche);
	setDepositoVaso(depositoVaso);
}

public void vaciarMonederos() {
	monedero=0;
}

@Override
public String toString() {
	return "Puedes servir: " + getDepositoCafe() + " cafe/s, " + getDepositoLeche() + "\n"
			+ "leche sola, tienes " + getDepositoVaso() + "\n"
			+ "vasos y el monedero con: " + getMonedero() + "€";
}

public void servirProducto(String producto, double dinero) {
	double devolucion;
if (producto.equalsIgnoreCase("CAFE")){
	if(depositoCafe>0 && depositoVaso>0 && dinero > PRECIO_CAFE) {
		devolucion=dinero-PRECIO_CAFE;
		if (monedero>devolucion) {
			monedero+=dinero;
			monedero-=devolucion;
			depositoCafe--;
			depositoVaso--;
			System.out.println("Producto servido. Su cambio es: "+devolucion);
		}else {
			System.out.println("No es posible dar cambio.");
		}
	}else if (dinero==PRECIO_CAFE && depositoVaso>0 && depositoCafe>0){
		monedero+=dinero;
		System.out.println("Producto servido.");
	}else {
		System.out.println("No es posible lo solicitado.");
	}
}else if (producto.equalsIgnoreCase("LECHE")) {
	if(depositoCafe>0 && depositoVaso>0 && dinero > PRECIO_LECHE) {
		devolucion=dinero-PRECIO_LECHE;
		if (monedero>devolucion) {
			monedero+=dinero;
			monedero-=devolucion;
			depositoLeche--;
			depositoVaso--;
			System.out.println("Producto servido. Su cambio es: "+devolucion);
		}else {
			System.out.println("No es posible dar cambio.");
		}
	}else if (dinero==PRECIO_LECHE && depositoVaso>0 && depositoLeche>0){
		monedero+=dinero;
		System.out.println("Producto servido.");
	}else {
		System.out.println("No es posible lo solicitado.");
	}
}else if(producto.equalsIgnoreCase("CAFE CON LECHE")) {
	if(depositoCafe>0 && depositoCafe>0 && depositoVaso>0 && dinero > PRECIO_CAFECONLECHE) {
		devolucion=dinero-PRECIO_CAFECONLECHE;
		if (monedero>devolucion) {
			monedero+=dinero;
			monedero-=devolucion;
			depositoLeche--;
			depositoVaso--;
			System.out.println("Producto servido. Su cambio es: "+devolucion);
		}else {
			System.out.println("No es posible dar cambio.");
		}
	}else if (dinero==PRECIO_CAFECONLECHE && depositoVaso>0 && depositoLeche>0 && depositoCafe>0){
		monedero+=dinero;
		System.out.println("Producto servido.");
	}else {
		System.out.println("No es posible lo solicitado.");
	}
}}


/*GETTERS AND SETTERS*/
public int getDepositoCafe() {
	return depositoCafe;
}

public void setDepositoCafe(int depositoCafe) {
	if(depositoCafe>0) {
		if(this.depositoCafe+depositoCafe>50) {
			this.depositoCafe=50;
		}else {
			this.depositoCafe+=depositoCafe;
		}
	}else {
		System.out.println("Los valores introducidos no son correctos.");
	}
}

public int getDepositoLeche() {
	return depositoLeche;
}

public void setDepositoLeche(int depositoLeche) {
	if(depositoLeche>0) {
		if(this.depositoLeche+depositoLeche>50) {
			this.depositoLeche=50;
		}else {
			this.depositoLeche+=depositoLeche;
		}
	}else {
		System.out.println("Los valores introducidos no son correctos.");
	}
}

public int getDepositoVaso() {
	return depositoVaso;
}

public void setDepositoVaso(int depositoVaso) {
	if(depositoVaso>0) {
		if(this.depositoVaso+depositoVaso>80) {
			this.depositoLeche=80;
		}else {
			this.depositoVaso+=depositoVaso;
		}
	}else {
		System.out.println("Los valores introducidos no son correctos.");
	}
}

public double getMonedero() {
	return monedero;
}

public void setMonedero(double monedero) {
	this.monedero = monedero;
}
	
}
