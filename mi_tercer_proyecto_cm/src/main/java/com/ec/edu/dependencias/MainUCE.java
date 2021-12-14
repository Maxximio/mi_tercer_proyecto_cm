package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		Scanner scannerInt = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("ingrese apellido: ");
		String apellido = scanner.nextLine();
		
		System.out.println("ingrese calle: ");
		String calle = scanner.nextLine();
		
		System.out.println("ingrese numeracion: ");
		String numeracion = scanner.nextLine();
		
		System.out.println("ingrese tipo: ");
		int tipo = scannerInt.nextInt();
		
		// TODO Auto-generated method stub
		
		

		Matricula matricula = new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		String mensaje = matricula.matricular(nombre,apellido,calle,numeracion,tipo);
		System.out.println(mensaje);
	}

}
