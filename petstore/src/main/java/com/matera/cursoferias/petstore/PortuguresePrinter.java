package com.matera.cursoferias.petstore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PortuguresePrinter {

	public void print() {
		System.out.println("Ola Mundo");
	}
}
