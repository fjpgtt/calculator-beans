package com.mx.iwaconsolti.calculator;

import com.mx.iwaconsolti.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}

	@Autowired
	private CalculatorService calculatorService;

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int secondNumber = scanner.nextInt();

		String option;

		do{
			System.out.println("Select the operation to perform Sum, Minus, Multiply, Divide: ");
			option = scanner.next().toLowerCase();

			switch (option){
				case "sum" :
					System.out.println("the result of the sum is: " + calculatorService.sum(firstNumber, secondNumber));
					break;
				case "minus" :
					System.out.println("the result of the minus is: " + calculatorService.minus(firstNumber, secondNumber));
					break;
				case "multiply" :
					System.out.println("the result of the multiply is: " + calculatorService.multiply(firstNumber, secondNumber));
					break;
				case "divide" :
					System.out.println("the result of the divide is: " + calculatorService.divide(firstNumber, secondNumber));
					break;
				default:
					System.out.println("invalid option");
			}
		} while(!option.equals("sum") && !option.equals("minus") && !option.equals("multiply") && !option.equals("divide"));

		scanner.close();
	}
}
