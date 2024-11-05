package com.mx.iwaconsolti.calculator.Services;
import com.mx.iwaconsolti.calculator.Interfaces.ArithmeticOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CalculatorService {
    private final ArithmeticOperation sumService;
    private final ArithmeticOperation divService;

    @Autowired
    private SubsService subsService;

    @Autowired
    private MultiplyService multiplyService;

    @Autowired
    public CalculatorService(
            @Qualifier("sum") ArithmeticOperation sumService,
            @Qualifier("div") ArithmeticOperation divService) {
        this.sumService = sumService;
        this.divService = divService;
    }

    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            printMenu();
            option = scanner.nextLine();

            if (!option.equals("5")) {
                processOperation(scanner, option);
            }
        } while (!option.equals("5"));

        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\nCalculadora - Seleccione una operación:");
        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        System.out.println("5: Salir");
    }

    private void processOperation(Scanner scanner, String option) {
        try {
            System.out.println("Ingrese el primer número:");
            double n1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Ingrese el segundo número:");
            double n2 = Double.parseDouble(scanner.nextLine());

            double result = executeOperation(option, n1, n2);
            printResult(option, result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Por favor ingrese números válidos");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Opción no válida");
        }
    }

    private double executeOperation(String option, double n1, double n2) {
        return switch (option) {
            case "1" -> sumService.execute(n1, n2);
            case "2" -> subsService.execute(n1, n2);
            case "3" -> multiplyService.execute(n1, n2);
            case "4" -> divService.execute(n1, n2);
            default -> throw new IllegalArgumentException("Opción no válida");
        };
    }

    private void printResult(String option, double result) {
        String operationType = switch (option) {
            case "1" -> "suma";
            case "2" -> "resta";
            case "3" -> "multiplicación";
            case "4" -> "división";
            default -> throw new IllegalArgumentException("Opción no válida");
        };

        System.out.println("Resultado de la " + operationType + ": " + (Math.round(result * 100.0) / 100.0));

    }
}