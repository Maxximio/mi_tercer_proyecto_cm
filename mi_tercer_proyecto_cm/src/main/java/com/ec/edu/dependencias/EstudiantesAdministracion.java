package com.ec.edu.dependencias;

public class EstudiantesAdministracion extends Estudiante{
	
	private String niffContabilidad;
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago");
		System.out.println(nombre + "TRANSFERENCIA");
	}

	public String getNiffContabilidad() {
		return niffContabilidad;
	}

	public void setNiffContabilidad(String niffContabilidad) {
		this.niffContabilidad = niffContabilidad;
	}
	

}
