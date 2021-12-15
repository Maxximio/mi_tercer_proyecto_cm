package com.ec.inyeccion.dependencias.framework;

public class Cuenta {
	private String numero;
	private int saldo;
	
	public Cuenta() {}
	
	public Cuenta(String numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//Get y Set
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	

}
