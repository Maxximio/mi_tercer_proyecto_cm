package com.ec.edu.inyeccion.dependencias.extendida;

public class Direccion {

	private String callePricipal;
	private String numeracion;

	// Metodos SET y Get

	public String getCallePricipal() {
		return callePricipal;
	}

	public void setCallePricipal(String callePricipal) {
		this.callePricipal = callePricipal;
	}

	public String getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	@Override
	public String toString() {
		return "Direccion [callePricipal=" + callePricipal + ", numeracion=" + numeracion + "]";
	}
	
}
