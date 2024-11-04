package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Service;

@Service
public class AdditionService {
    public double add(double num1, double num2) {
        return num1 + num2;
    }
}
