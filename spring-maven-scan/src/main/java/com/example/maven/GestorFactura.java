package com.example.maven;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GestorFactura {
	
	//1.atributos
	Calculadora calculadora;

	//2. contructores
	public GestorFactura(Calculadora calculadora) {
		System.out.println("Ejecutando contructor GestorFactura");
		this.calculadora = calculadora;
		
	}
	
	//3. metodos
	
}
