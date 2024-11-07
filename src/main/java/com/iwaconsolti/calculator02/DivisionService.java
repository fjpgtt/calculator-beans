package com.iwaconsolti.calculator02;

import org.springframework.stereotype.Component;

@Component("division")
public class DivisionService implements IOperations {
     @Override
    public double operation(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("No puede dividir por 0");
        }
        return num1 / num2;
    }
}
