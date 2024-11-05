package com.mx.iwaconsolti.calculator.main;

import com.mx.iwaconsolti.calculator.interfaces.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mx.iwaconsolti.calculator.operation", "com.mx.iwaconsolti.calculator.config", "com.mx.iwaconsolti.calculator.service"})
public class CalculatorApplication implements CommandLineRunner {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorApplication(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) {
        calculatorService.execute();
    }
}
