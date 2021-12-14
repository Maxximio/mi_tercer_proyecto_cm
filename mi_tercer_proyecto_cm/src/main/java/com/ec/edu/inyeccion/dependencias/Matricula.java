package com.ec.edu.inyeccion.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;
	private Direccion direccion;
	
	public Matricula(Estudiante estudiante,Direccion direccion) {
		this.estudiante = estudiante;
		this.direccion = direccion;
	}
	
	public String matricular(String nombre, String apellido, String calle, String numero ) {
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		this.direccion.setCallePricipal(calle);
		this.direccion.setNumeracion(numero);
		
		
		/*	this.estudiante= new Estudiante();//JVM  heap // INYECCION DE DEPENDENCIAS	
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion = new Direccion();
		direccion.setCallePricipal(calle);
		direccion.setNumeracion(numero);
		*/
		this.estudiante.setDireccion(direccion);
		
		// logica para el guardado en la base de datos
		System.out.println(this.estudiante);
		
		this.estudiante.pagarServiPagos(nombre);
		
		return "El estudiante guardado con exito";
	}

	// Metodos SET y GET

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
