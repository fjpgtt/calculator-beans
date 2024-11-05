package com.mx.iwaconsolti.calculator.service;

import com.mx.iwaconsolti.calculator.interfaces.CalculatorService;
import com.mx.iwaconsolti.calculator.operation.Divide;
import com.mx.iwaconsolti.calculator.operation.Minus;
import com.mx.iwaconsolti.calculator.operation.Multiply;
import com.mx.iwaconsolti.calculator.operation.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private Sum sum;
    private Divide divide;
    private Minus minus;

    @Autowired
    private Multiply multiply;

    @Autowired
    public void setMinus(Minus minus) {
        this.minus = minus;
    }

    @Autowired
    public void setDivide(Divide divide) {
        this.divide = divide;
    }

    @Autowired
    public CalculatorServiceImpl(Sum sum) {
        this.sum = sum;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to this calculator that uses Beans");
        while (true) {
            System.out.println("1.-Sum\n2.-Minus\n3.-Multiply\n4.-Divide\nAny other number or character = Exit");
            String operation = scanner.next();
            if (operation.equals("1") || operation.equals("2") || operation.equals("3") || operation.equals("4")) {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("\nEnter the second number: ");
                int num2 = scanner.nextInt();

                switch (Integer.parseInt(operation)) {
                    case 1:
                        System.out.println("Result: " + sum.operation(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + minus.operation(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply.operation(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + divide.operation(num1, num2));
                        break;
                    default:
                }
            } else {
                System.out.println("Bye!");
                break;
            }
        }
    }
}
