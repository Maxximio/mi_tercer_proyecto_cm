package luis.ortiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app1 = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beansp.xml");
		Paciente pacien = (Paciente) app1.getBean("paciente");
		System.out.println(pacien.getNombre());
		System.out.println(pacien.getApellido());
		System.out.println(pacien.getEdad());
		
		
		
		Profesor profe = (Profesor) app1.getBean("profesor");
		//int edadTotal = estu.getEdad()+10;
		System.out.println(profe.getNombre() + " " + profe.getApellido()+ " " + profe.getProfesion()+" "+ profe.getUniversidad()+ "");

	}


}
