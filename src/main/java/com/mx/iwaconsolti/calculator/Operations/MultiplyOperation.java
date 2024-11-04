package com.mx.iwaconsolti.calculator.Operations;

import com.mx.iwaconsolti.calculator.Interface.OperationsInterface;

public class MultiplyOperation implements OperationsInterface {
//    Method that returns the multiply of two numbers
    @Override
    public double calculate(double a, double b) {
        return (a * b);
    }
}
