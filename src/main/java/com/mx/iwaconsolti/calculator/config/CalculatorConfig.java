package com.mx.iwaconsolti.calculator.config;

import com.mx.iwaconsolti.calculator.persistence.model.Minus;
import com.mx.iwaconsolti.calculator.persistence.model.Sum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Sum sumOperation(){return new Sum();}

    @Bean
    public Minus minusOperation(){return new Minus();}
}
