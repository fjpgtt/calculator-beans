package com.mx.iwaconsolti.calculator.Operation;

import org.springframework.stereotype.Component;

@Component
public class Minus {
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
