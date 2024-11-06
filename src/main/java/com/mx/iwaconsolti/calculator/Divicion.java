package com.mx.iwaconsolti.calculator;

import org.springframework.stereotype.Component;

@Component
public class Divicion {

    public double divicionNumeros(double numero1, double numero2){
        System.out.println("Hola desde el Bean Divicion con @Bean");
        return (numero1 / numero2);
    }

}
