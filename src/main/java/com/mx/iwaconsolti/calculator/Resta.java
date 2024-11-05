package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Resta {
    private double Resultadoresta;
    public double Resta(double a, double b){
        Resultadoresta = a - b;
        return Resultadoresta;

    }
}
