package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Suma {

    public double sumaNumeros(double numero1, double numero2){
        System.out.println("Hola desde el Bean Suma");
        return (numero1 + numero2);
    }

}
