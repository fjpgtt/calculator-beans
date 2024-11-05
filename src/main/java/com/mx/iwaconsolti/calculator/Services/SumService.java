package com.mx.iwaconsolti.calculator.Services;

import com.mx.iwaconsolti.calculator.Interfaces.ArithmeticOperation;

public class SumService implements ArithmeticOperation {
    @Override
    public double execute(double n1, double n2) {
        return Math.round((n1 + n2) * 100.0) / 100.0;
    }
}
