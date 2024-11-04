package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Service;

@Service
public class SubtractionService {
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
}
