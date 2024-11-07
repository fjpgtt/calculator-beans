package com.mx.iwaconsolti.calculator.ConfigCalculator;

import com.mx.iwaconsolti.calculator.Operations.AddOperation;
import com.mx.iwaconsolti.calculator.Operations.MinusOperation;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.mx.iwaconsolti.calculator.ConfigCalculator")
public class CalculatorConfig {

    @Bean
    public AddOperation addOperation(){
        return new AddOperation();
    }

    @Bean
    public MinusOperation minusOperation(){
        return new MinusOperation();
    }
}
