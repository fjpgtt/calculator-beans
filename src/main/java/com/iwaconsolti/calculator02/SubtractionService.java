package com.iwaconsolti.calculator02;

import org.springframework.stereotype.Component;

@Component("subtraction")
public class SubtractionService implements IOperations{
    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
