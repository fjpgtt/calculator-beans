package com.mx.iwaconsolti.calculator.Services;

import com.mx.iwaconsolti.calculator.Interfaces.ArithmeticOperation;

public class DividedService implements ArithmeticOperation {
    @Override
    public double execute(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return Math.round((n1 / n2) * 100.0) / 100.0;
    }
}
