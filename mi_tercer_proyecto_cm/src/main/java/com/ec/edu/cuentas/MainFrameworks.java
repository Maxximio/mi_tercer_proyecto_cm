package com.ec.edu.cuentas;

import java.util.Scanner;



public class MainFrameworks {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("BIENVENIDO AL BANCOLAOL");
		System.out.println("para poder crear la cuenta por favor ingrese los siguientes datos");
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese cedula");
		String cedula = scanner.nextLine();
		
		System.out.println("ingrese numero de cuenta");
		String numeroCuenta = scanner.nextLine();
		
		System.out.println("ingrese saldo");
		int saldo = scannerInt.nextInt();
		
		System.out.println("que tipo de cuenta desea?");
		System.out.println("1 cuenta ahorros 2. cuenta corriente, 3. cuenta poliza");
		System.out.println("Ingrese tipo de cuenta:");
		int tipo = scannerInt.nextInt();
		
		Cuenta cuenta = null;
		if(tipo==1) {
			cuenta = new CuentaAhorros();
			
		}else if(tipo==2) {
			cuenta = new CuentaCorriente();
		}else if (tipo==3){
			cuenta = new CuentaPoliza();
		}else {
			System.out.println("error");
			
		}
			GestorCuentas gestion = new GestorCuentas(cuenta, new CuentaHabiente());
			
			
			String mensaje  = gestion.gestionar(nombre, apellido, cedula, numeroCuenta);
			System.out.println(mensaje);
			
		}
	}


