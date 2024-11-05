package com.mx.iwaconsolti.calculator;

public class Division {
    public double Division(double a, double b){
        if (b != 0 || a != 0) {
            return a / b;
        }
        else
            System.out.println("Error: No se puede dividir entre cero.");
        return 0;
    }

}
