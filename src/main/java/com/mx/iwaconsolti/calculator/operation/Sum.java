package com.mx.iwaconsolti.calculator.operation;

import com.mx.iwaconsolti.calculator.interfaces.OperationInferface;

public class Sum implements OperationInferface {
    @Override
    public double operation(double num1, double num2) {
        return num1 + num2;
    }
}
