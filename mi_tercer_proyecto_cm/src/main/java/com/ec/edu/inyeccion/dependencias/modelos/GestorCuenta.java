package com.ec.edu.inyeccion.dependencias.modelos;

public class GestorCuenta {
	
	private ICuenta cuenta;
	
	public GestorCuenta(ICuenta cuenta) {
		this.cuenta = cuenta;
		
	}
	
	
	public void registrarCuentaHabiente() {
		this.cuenta.calcularBenieficio();
		this.cuenta.calcularDescuento("343");
	}

}
