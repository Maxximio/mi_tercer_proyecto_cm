package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaFuturo implements ICuenta {

	@Override
	public void calcularDescuento(String numero) {
		System.out.println("nuevo metodo");
		
	}

	@Override
	public void calcularBenieficio() {
		System.out.println("Nuevo Beneficio");
		
	}

}
