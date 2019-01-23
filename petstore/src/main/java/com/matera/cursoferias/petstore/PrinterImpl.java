package com.matera.cursoferias.petstore;

import org.springframework.stereotype.Component;

@Component
public class PrinterImpl implements Printer {

	@Override
	public void print() {
		System.out.println("Hello World");
	}

}
