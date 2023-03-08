package com.udu.producto.model;

public class Producto {
	
	String cod_producto;
	String descripcion;
	double precio;
	double iva;
	
	public Producto() {
		super();
		this.cod_producto="0000";
		this.iva=0.2;
	}
	
	public Producto(double precio, String descripcion) {
		this();
		this.cod_producto="0000";
		this.iva=0.2;
		this.precio=precio;
		this.descripcion=descripcion;
	}
	
	public double calcularPrecio(double precio) {
		this.precio=precio;
		double precioConIva;
		
		precioConIva=precio+(precio*this.iva);
	
		return precioConIva;
	}

	public String getCod_producto() {
		return cod_producto;
	}

	public void setCod_producto(String cod_producto) {
		this.cod_producto = cod_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}
	
}
