package com.ec.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Cuenta miCuenta = (Cuenta) app.getBean("cuenta");
		System.out.println(miCuenta.getNumero()+"   "+miCuenta.getSaldo());
		// app.getBean(Cuenta.class);
		
		//codigo acoplado
		/*Cuenta miCuentaPrueba=new Cuenta();
		miCuentaPrueba.setNumero("1234");
		miCuentaPrueba.setSaldo(100);
		
		Cuenta miCuentaPrueba2=new Cuenta("1234",100);*/
		
		Cuenta miCuenta1 = (Cuenta) app.getBean("cuenta1");
		System.out.println(miCuenta1.getNumero()+"   "+miCuenta1.getSaldo());
		
		Estudiante estu=(Estudiante) app.getBean("estu");
		int edadTotal=estu.getEdad()+10;
		System.out.println(estu.getNombre()+ " "+ estu.getApellido()+" "+edadTotal);

	}

}
