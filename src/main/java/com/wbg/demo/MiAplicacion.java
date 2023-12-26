package com.wbg.demo;

public class MiAplicacion {

	public static void main(String[] args) {

		String nombre = "xbox";
		int cantidad = 10;
		double valor = 400.20;
		double total = cantidad * valor;
		System.out.println(nombre + " cantidad = " + cantidad + " total = " + total);
		
		
		String nombrec = "celular";
		int cantidadc = 10;
		double valorc = 250.55;
		double totalc = cantidadc * valorc;
		System.out.println(nombrec + " cantidadc = " + cantidadc + " total = " + totalc);

		double totalFactura = total + totalc;
		System.out.println("total = " + totalFactura);

	}

}