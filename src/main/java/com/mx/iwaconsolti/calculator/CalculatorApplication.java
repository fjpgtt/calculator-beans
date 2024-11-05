package com.mx.iwaconsolti.calculator;

import com.mx.iwaconsolti.calculator.Services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Autowired
	private CalculatorService calculatorService;

	@Override
	public void run(String... args) {
		calculatorService.runCalculator();
	}
}
