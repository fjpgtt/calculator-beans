package com.iwa.Calculator;

import com.iwa.Calculator.Operation.Divide;
import com.iwa.Calculator.Operation.Minus;
import com.iwa.Calculator.Operation.Multiply;
import com.iwa.Calculator.Operation.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorWithSpringBootApplication implements CommandLineRunner {

    private Sum sum;
    private Divide divide;
    private Minus minus;
    //--------------------------------------------------------------------------------------
    // Inyección de campo/field
    @Autowired
    private Multiply multiply;

    //--------------------------------------------------------------------------------------
    // Constructor para inyectar el Bean Sum
    @Autowired
    public CalculatorWithSpringBootApplication(Sum sum) {
        this.sum = sum;
    }

    //--------------------------------------------------------------------------------------
    // Setter para inyectar el Bean Minus
    @Autowired
    public void setMinus(Minus minus) {
        this.minus = minus;
    }

    // Setter para inyectar el Bean Divide
    @Autowired
    public void setDivide(Divide divide) {
        this.divide = divide;
    }

    //--------------------------------------------------------------------------------------
    public static void main(String[] args) {
        SpringApplication.run(CalculatorWithSpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Si deseas terminar escribe cualquier cosa\n" +
                    "Escribe que deseas hacer, sumar, restar, multiplicar, dividir: ");
            String operation = scanner.next();

            System.out.println("Ingresa primer numero: ");
            int a = scanner.nextInt();

            System.out.println("Ingresa segundo numero: ");
            int b = scanner.nextInt();

            switch (operation) {
                case "sumar":
                case "s":
                    System.out.println("Suma: " + sum.operation(a, b));
                    continue;
                case "restar":
                case "r":
                    System.out.println("Resta: " + minus.operation(a, b));
                    continue;
                case "multiplicar":
                case "m":
                    System.out.println("Multiplicación: " + multiply.operation(a, b));
                    continue;
                case "dividir":
                case "d":
                    System.out.println("División: " + divide.operation(a, b));
                    continue;
                default:
                    System.out.println("Adios");
            }
            break;
        }
    }
}

