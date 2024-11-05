package com.calculator.demo.operations.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("Div")
    public Divide divide (){
        return new Divide();
    }

    @Bean("Mul")
    public Multiply multiply (){
        return new Multiply();
    }
}
