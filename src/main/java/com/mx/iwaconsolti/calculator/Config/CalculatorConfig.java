package com.mx.iwaconsolti.calculator.Config;

import com.mx.iwaconsolti.calculator.Operation.Divide;
import com.mx.iwaconsolti.calculator.Operation.Sum;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.iwa.Calculator.Operation"})
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
