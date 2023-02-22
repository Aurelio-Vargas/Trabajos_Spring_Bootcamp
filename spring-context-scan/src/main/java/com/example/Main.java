package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		NotificationService notificationService = (NotificationService) context.getBean("notificationService");
		String texto = notificationService.imprimirSaludo();
		System.out.println(texto);
		
		UserService gestor =  (UserService) context.getBean("userService");
		System.out.println(gestor.notificationService.imprimirSaludo());
	}

}
