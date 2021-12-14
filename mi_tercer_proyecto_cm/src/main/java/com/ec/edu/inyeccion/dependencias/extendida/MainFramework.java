package com.ec.edu.inyeccion.dependencias.extendida;

import java.util.Scanner;



public class MainFramework {
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese apellido");
		String apellido = scanner.nextLine();

		System.out.println("Ingrese calle");
		String calle = scanner.nextLine();

		System.out.println("Ingrese numeracion");
		String numeracion = scanner.nextLine();
		
		System.out.println("Ingrese tipo");
		int tipo = scannerInt.nextInt();
		
		Estudiante estudiante;
		
		if(tipo==1) {
			estudiante = new Estudiante();
		}else if(tipo==2) {
			estudiante = new EstudianteOdontologia();
		}else if(tipo==3){
			estudiante = new EstudianteArquitetura();
		}else {
			estudiante = new EstudiantesAdministracion();
		}

		Matricula matricula = new Matricula(estudiante, new Direccion());
		matricula.setAnio(2015);


		matricula.setSemestre("Sexto");

		String mensaje = matricula.matricular(nombre, apellido, calle, numeracion);
		System.out.println(mensaje);
	}

}
