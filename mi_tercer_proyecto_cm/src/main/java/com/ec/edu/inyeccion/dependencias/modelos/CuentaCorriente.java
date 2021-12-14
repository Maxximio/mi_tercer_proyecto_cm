package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaCorriente implements ICuenta{
	private float montoMinimo;
	
	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Calculando corriente..... " +numero);
		
	}

	@Override
	public void calcularBenieficio() {
		System.out.println("Calculando beneficio corriente");
		
	}
	
	//Metodos SET Y GET
	

	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}


	
	
	

}
