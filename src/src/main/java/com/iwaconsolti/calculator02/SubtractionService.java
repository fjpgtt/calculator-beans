package com.mx.iwaconsolti.calculator02;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService implements IOperations{
    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
