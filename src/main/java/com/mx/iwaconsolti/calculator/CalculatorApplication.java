package com.mx.iwaconsolti.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static java.lang.System.out;

@SpringBootApplication
public class 	CalculatorApplication implements CommandLineRunner {
	private final Suma suma;
	private final Resta resta;
	private final Multiplicacion multiplicacion;
	private final Divicion divicion;

	public CalculatorApplication(Suma suma,Resta resta,Multiplicacion multiplicacion,Divicion divicion) {
		this.suma = suma;
		this.resta = resta;
		this.divicion = divicion;
		this.multiplicacion = multiplicacion;

	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

			out.println("Ingresa un numero");
			double numero1 = scanner.nextDouble();

			out.println("Ingresa otro numero");
			double numero2 = scanner.nextDouble();


			System.out.println("La suma es: " + suma.sumaNumeros(numero1, numero2));

			System.out.println("La resta es: " + resta.restaNumeros(numero1, numero2));

			System.out.println("La divicion es: " + divicion.divicionNumeros(numero1, numero2));

			System.out.println("La divicion es: " + multiplicacion.multiplicacionNumeros(numero1, numero2));

	}
}
