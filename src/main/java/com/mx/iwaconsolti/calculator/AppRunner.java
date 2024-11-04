package com.mx.iwaconsolti.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class AppRunner implements CommandLineRunner {
    /*
    @Autowired private AdditionService additionService;
    @Autowired private SubtractionService subtractionService;
    @Autowired private MultiplicationService multiplicationService;
    @Autowired private DivisionService divisionService;
    */

    private final AdditionService additionService;
    private final SubtractionService subtractionService;
    private final MultiplicationService multiplicationService;
    private final DivisionService divisionService;

    @Autowired
    public AppRunner(AdditionService additionService, SubtractionService subtractionService, MultiplicationService multiplicationService, DivisionService divisionService) {
        this.additionService = additionService;
        this.subtractionService = subtractionService;
        this.multiplicationService = multiplicationService;
        this.divisionService = divisionService;
    }

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la operacion a realizar \n1)suma \n2)resta \n3)multiplicacion \n4)division):");
        int operation = scanner.nextInt();

        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        double result = 0;

        if (operation == 1) {
            result = additionService.add(num1, num2);
        }
        if (operation == 2) {
            result = subtractionService.subtract(num1, num2);
        }
        if (operation == 3) {
            multiplicationService.setNum1(num1);
            multiplicationService.setNum2(num2);
            result = multiplicationService.multiply();
        }
        if (operation == 4) {
            divisionService.setNum1(num1);
            divisionService.setNum2(num2);
            result = divisionService.divide();
        }

        System.out.printf("El resultado de la %s es: %.2f%n", operation, result);
    }
}
