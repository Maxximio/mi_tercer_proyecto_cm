package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaAhorros implements ICuenta{
	private String numeroAhorro;
	private int monto;
	
	@Override
	public void calcularDescuento(String numero) {
		System.out.println("Se calcula el descuento de: " +numero);
		
	}
	@Override
	public void calcularBenieficio() {
		System.out.println("Se calcula el beneficio...");
		
	}
	
	//metodos set y get
	
	public String getNumeroAhorro() {
		return numeroAhorro;
	}
	public void setNumeroAhorro(String numeroAhorro) {
		this.numeroAhorro = numeroAhorro;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

	

}
