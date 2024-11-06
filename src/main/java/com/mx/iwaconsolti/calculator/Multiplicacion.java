package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Multiplicacion {

    public double multiplicacionNumeros(double numero1, double numero2){
        System.out.println("Hola desde el Bean Multiplicacion con @Component");
        return (numero1 * numero2);
    }

}
