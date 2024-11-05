package com.mx.iwaconsolti.calculator.config;

import com.mx.iwaconsolti.calculator.operation.Divide;
import com.mx.iwaconsolti.calculator.operation.Sum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {

    @Bean
    public Sum sum() {
        return new Sum();
    }

    @Bean
    public Divide divide() {
        return new Divide();
    }

}
