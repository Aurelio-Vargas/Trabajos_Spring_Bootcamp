package com.example.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//EConcepto 1:Obtener el bean de spring
		// Opcion 1. Crear un objeto de forma normal
		// Calculadora servicio = new Calculadora();
				
		// Opcion 2. Recibir un objeto de Spring		
		
		Calculadora calculadora = (Calculadora) context.getBean("calculadora");
		String texto = calculadora.holaMundo();
		System.out.println(texto);
		
		// se puede volver a obtener
		//OJO; se recupera el mismo objeto
		Calculadora calculadora2 =(Calculadora) context.getBean("calculadora");
		System.out.println(texto);
		
		//Concepto 2: cargar un beans dentro de otro bean
		GestorFactura gestor = (GestorFactura) context.getBean("gestorFactura");
		System.out.println(gestor.calculadora.holaMundo());
		
		//Concepto 3: scope o alcance
		//los bean por defecto son sinleton, se crea el objeto y se reutiliza para toda la aplicacion
		// podemos cambiar a scope="prototype" si queremos que se cree un nuevo objeto cada vez
		// verificarlo viendo como se ejecuta varias veces un contructor
		
		
	}

}
