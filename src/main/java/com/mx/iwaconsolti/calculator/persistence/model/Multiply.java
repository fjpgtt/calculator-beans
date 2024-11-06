package com.mx.iwaconsolti.calculator.persistence.model;

import org.springframework.stereotype.Component;

@Component
public class Multiply {
    public double calculate(double num1, double num2){
        return num1 * num2;
    }
}
