package com.mx.iwaconsolti.calculator.ServiceCalculator;

import com.mx.iwaconsolti.calculator.Operations.AddOperation;
import com.mx.iwaconsolti.calculator.Operations.DivideOperation;
import com.mx.iwaconsolti.calculator.Operations.MinusOperation;
import com.mx.iwaconsolti.calculator.Operations.MultiplyOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CalculatorService {
    private final AddOperation addOperation;
    private final DivideOperation divideOperation;
    private final MinusOperation minusOperation;
    private final MultiplyOperation multiplyOperation;

    @Autowired
    public CalculatorService(AddOperation addOperation, DivideOperation divideOperation, MinusOperation minusOperation, MultiplyOperation multiplyOperation) {
        this.addOperation = addOperation;
        this.divideOperation = divideOperation;
        this.minusOperation = minusOperation;
        this.multiplyOperation = multiplyOperation;
    }

    public double calculate(String option, double n1, double n2) {
        Scanner scanner = new Scanner(System.in);
        switch (option.toLowerCase()) {
            case "add":
                return addOperation.calculate(n1, n2);
            case "minus":
                return minusOperation.calculate(n1, n2);
            case "multiply":
                return multiplyOperation.calculate(n1, n2);
            case "divide":
                return divideOperation.calculate(n1, n2);
            default:
                System.out.print("Invalid option");
                return 0;

        }
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        do {

            System.out.println("Which operation do you want to do? \n 1.- Add \n 2.- Minus \n 3.- Multiply \n 4.- Divide");
            String operation = scanner.nextLine();

            System.out.print("Enter the first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double secondNumber = scanner.nextDouble();

            scanner.nextLine();

            double result = calculate(operation, firstNumber, secondNumber);
            System.out.println("The result of the " + operation + " is: " + result);

            System.out.println("Do you want to do another operation? (YES/NO)");
            String repeat = scanner.nextLine();
            if (repeat.equalsIgnoreCase("no")) {

                System.out.println("Thanks!");
                f = false;
                break;
            }

        } while (f);
    }
}

