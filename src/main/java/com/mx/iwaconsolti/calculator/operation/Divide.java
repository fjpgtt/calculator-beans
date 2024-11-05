package com.mx.iwaconsolti.calculator.operation;

import com.mx.iwaconsolti.calculator.interfaces.OperationInferface;

public class Divide implements OperationInferface {
    @Override
    public double operation(double num1, double num2) {
        return num2 == 0 ? -1 : num1 / num2;
    }

}
