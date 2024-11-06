package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Resta {

    public double restaNumeros(double numero1, double numero2){
        System.out.println("Hola desde el Bean Resta con @Bean");
        return (numero1 - numero2);
    }

}
