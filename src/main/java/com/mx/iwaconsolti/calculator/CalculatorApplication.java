package com.mx.iwaconsolti.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CalculatorApplication{

	public static void main(String[] args){
		ConfigurableApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		context.close();
	}
}

