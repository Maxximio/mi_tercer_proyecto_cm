package com.ec.edu.cuentas;

public class GestorCuentas {
	
	
	private Cuenta cuenta;
	private CuentaHabiente cuentaHabiente;
	
	public GestorCuentas(Cuenta cuenta, CuentaHabiente cuentaHabiente) {
		this.cuenta = cuenta;
		this.cuentaHabiente = cuentaHabiente;
	}
	
	public String gestionar(String nombre, String apellido, String cedula, String numeroCuenta ) {
		this.cuenta.setNumeroCuenta(numeroCuenta);
		
		this.cuentaHabiente.setNombre(nombre);
		this.cuentaHabiente.setApellido(apellido);
		this.cuentaHabiente.setCedula(cedula);
		
		this.cuenta.setCuentaHabiente(cuentaHabiente);
		
				
		
		this.cuenta.aperturaCuenta(100, 0);
		System.out.println(this.cuenta);
		
		return "La cuenta guardada con exito";
		
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}
	
	
	

}
