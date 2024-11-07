package com.mx.iwaconsolti.calculator.Operations;

import com.mx.iwaconsolti.calculator.Interface.OperationsInterface;

public class AddOperation implements OperationsInterface {
    //Method to calculate the add of two numbers
    @Override
    public double calculate(double a, double b) {
        return (a + b);
    }

}
