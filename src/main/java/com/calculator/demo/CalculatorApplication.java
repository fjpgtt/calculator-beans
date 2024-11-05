package com.calculator.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    private final Access access;

    @Autowired
    public CalculatorApplication(Access access) {
        this.access = access;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Input the operator: ");
        String operator = scanner.next();

        menu(firstNumber, secondNumber, operator);
    }

    public void menu(int a, int b, String operator) {
        switch (operator) {
            case "+":
                System.out.println("The result is: " + access.calculateSum(a, b));
                break;
            case "-":
                System.out.println("The result is: " + access.calculateSubs(a, b));
                break;
            case "*":
                System.out.println("The result is: " + access.calculateMul(a, b));
                break;
            case "/":
                System.out.println("The result is: " + access.calculateDiv(a, b));
                break;
        }
    }
}
