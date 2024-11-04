package com.mx.iwaconsolti.calculator.Operations;

import com.mx.iwaconsolti.calculator.Interface.OperationsInterface;
import org.springframework.stereotype.Component;

public class MinusOperation implements OperationsInterface {
    //Method that return the minus of two numbers
    @Override
    public double calculate(double a, double b) {
        return (a - b);
    }
}
