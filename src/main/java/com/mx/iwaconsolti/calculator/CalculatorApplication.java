package com.mx.iwaconsolti.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {
	private Suma Resustadosuma;
	private Division Resultadodivision;
	private Multiplicacion Resultadomultiplicacion;


	@Autowired                          //inyeccion por autowired
	private Resta Resultadoresta;
	@Autowired                          //inyeccion Setter
	public void Setdivision(Division division) {
		this.Resultadodivision = division;
	}
	public  CalculatorApplication(Suma suma, Multiplicacion multiplicacion){
		this.Resustadosuma = suma;
		this.Resultadomultiplicacion = multiplicacion;
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		double a = 0, b = 0;
		int opcion = 0;

		do {
			// Validar opción
			while (true) {
				try {
					System.out.println("Seleccione una operación:");
					System.out.println("1. Suma");
					System.out.println("2. Resta");
					System.out.println("3. Multiplicación");
					System.out.println("4. División");
					System.out.println("5. Salir");
					System.out.print("Opción: ");
					opcion = scanner.nextInt();
					break; // Salir del bucle si se ingresa un número válido
				} catch (InputMismatchException e) {
					System.out.println("Por favor, ingrese un número válido.");
					scanner.next(); // Limpiar el buffer
				}
			}

			// Validar números para las operaciones
			if (opcion >= 1 && opcion <= 4) {
				while (true) {
					try {
						System.out.print("Ingrese el número a: ");
						a = scanner.nextInt();
						System.out.print("Ingrese el número b: ");
						b = scanner.nextInt();
						break; // Salir del bucle si se ingresa un número válido
					} catch (InputMismatchException e) {
						System.out.println("Por favor, ingrese un número válido.");
						scanner.next(); // Limpiar el buffer
					}
				}
			}

			switch (opcion) {
				case 1:
					System.out.println("El resultado de la suma es: " + this.Resustadosuma.Setsuma(a, b));
					break;
				case 2:
					System.out.println("El resultado de la resta es: " + Resultadoresta.Resta(a, b));
					break;
				case 3:
					System.out.println("El resultado de la multiplicación es: " + Resultadomultiplicacion.Multiplicacion(a, b));
					break;
				case 4:
					System.out.println("El resultado de la división es: " + Resultadodivision.Division(a, b));
					break;
				case 5:
					System.out.println("Saliendo del programa.");
					break;
				default:
					System.out.println("Opción no válida. Intente nuevamente.");
			}

			System.out.println(); // Línea en blanco para mejorar la legibilidad
		} while (opcion != 5);

		scanner.close();
	}

	}

