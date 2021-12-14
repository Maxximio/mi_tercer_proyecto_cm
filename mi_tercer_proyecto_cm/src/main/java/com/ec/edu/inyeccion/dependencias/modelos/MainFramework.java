package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		
		
		
		Scanner scannerInt = new Scanner(System.in);
		
		System.out.println("Ingrese tipo:");
		int tipo = scannerInt.nextInt();
		ICuenta cuenta = null;
		if(tipo==1) {
			cuenta = new CuentaCorriente();
			
		}else if(tipo==2) {
			cuenta = new CuentaAhorros();
		}else if(tipo==3){
			cuenta = new CuentaFuturo();
		}else {
			cuenta = new ICuenta() {
				
				@Override
				public void calcularDescuento(String numero) {
					System.out.println("hola");
					
				}
				
				@Override
				public void calcularBenieficio() {
					System.out.println("buen beneficio");
					
				}
			};
		}

		GestorCuenta gestor = new GestorCuenta(cuenta);
		gestor.registrarCuentaHabiente();
	}

}
