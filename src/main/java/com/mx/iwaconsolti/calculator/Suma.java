package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Suma {
    private double Resultadosuma;
    public double Setsuma(double a, double b) {
        this.Resultadosuma = a + b;
        return Resultadosuma;
    }
}
