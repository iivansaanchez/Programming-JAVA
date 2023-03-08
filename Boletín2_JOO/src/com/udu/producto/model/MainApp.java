package com.udu.producto.model;

public class MainApp {

	public static void main(String[] args) {
		Producto pro1 = new Producto(500, "Fantastica playStation5.");
		System.out.println(pro1.calcularPrecio(500));

	}

}
