package com.mx.iwaconsolti.calculator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		// Use the SumService to calculate the sum
		int result = firstNumber + secondNumber;

		System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + result);
	}
}
