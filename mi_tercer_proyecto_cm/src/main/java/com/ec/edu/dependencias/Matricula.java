package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;
	
	public String matricular(String nombre, String apellido, String calle, String numero, int tipo ) {
		if(tipo==1) {
			this.estudiante = new Estudiante();
			this.estudiante.pagarServiPagos(nombre);
			
		}else if(tipo==2){
			this.estudiante = new EstudianteOdontologia();
		}else if(tipo==3) {
			this.estudiante = new EstudianteArquitetura();
			
		}else {
			this.estudiante = new EstudiantesAdministracion();
		}
		//this.estudiante= new Estudiante();//JVM  heap // INYECCION DE DEPENDENCIAS	
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion = new Direccion();
		direccion.setCallePricipal(calle);
		direccion.setNumeracion(numero);
		
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
}
