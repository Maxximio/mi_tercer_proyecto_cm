package com.ec.edu.dependencias;

public class EstudianteArquitetura extends Estudiante{
	
	private String IdMunicipio;
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago");
		System.out.println(nombre + "PAYPAL");
	}
	public String getIdMunicipio() {
		return IdMunicipio;
	}
	public void setIdMunicipio(String idMunicipio) {
		IdMunicipio = idMunicipio;
	}


}
