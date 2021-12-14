package com.ec.edu.cuentas;

public class Cuenta {
	
	protected String numeroCuenta;
	protected int saldo;
	protected int valorDeInteres;
	protected CuentaHabiente cuentaHabiente;
	
	
	
	
	//metodos y set
	public void aperturaCuenta(int saldo, int valorDeInteres) {
		if(saldo>=100) {
			System.out.println("Cuenta creada ");
			
			
		}else {
			System.out.println("valor minimo 100 para apertura de cuenta");
		}
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getValorDeInteres() {
		return valorDeInteres;
	}
	public void setValorDeInteres(int valorDeInteres) {
		this.valorDeInteres = valorDeInteres;
	}
	
	public CuentaHabiente getCuentaHabiente() {
		return cuentaHabiente;
	}
	public void setCuentaHabiente(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
	}
	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", valorDeInteres=" + valorDeInteres + "]";
	}
	
	
	
	

}
