package com.iwaconsolti.calculator02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {
    private final IOperations additionService;
    private final IOperations subtractionService;
    private final IOperations multiplicationService;
    private final IOperations divisionService;

    @Autowired
    public AppRunner( @Qualifier("addition") IOperations additionService,
                      @Qualifier("subtraction") IOperations subtractionService,
                      @Qualifier("multiplication") IOperations multiplicationService,
                      @Qualifier("division") IOperations divisionService) {
        this.additionService = additionService;
        this.subtractionService = subtractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }

    @Override
    public void run(String... args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la operacion a realizar \n1)suma \n2)resta \n3)multiplicacion \n4)division):\nSelecciona opcion entre 1-4:");
        int operation = scanner.nextInt();

        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operation == 1) {
            result = additionService.operation(num1, num2);
        }
        if (operation == 2) {
            result = subtractionService.operation(num1, num2);
        }
        if (operation == 3) {
            result = multiplicationService.operation(num1, num2);
        }
        if (operation == 4) {
            result = divisionService.operation(num1, num2);
        }

        System.out.printf("El resultado de la %s es: %.2f%n", operation, result);
    }
}