package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Saludo saludo =(Saludo) context.getBean("Saludo");
		String texto=saludo.imprimirSaludo();
		System.out.println(texto);
	}

}

