package com.mx.iwaconsolti.calculator.Operations;

import com.mx.iwaconsolti.calculator.Interface.OperationsInterface;
import org.springframework.stereotype.Component;

@Component
public class DivideOperation implements OperationsInterface {
//method to divide two numbers
    @Override
    public double calculate(double a, double b) {
        return (a/b);
    }
}
