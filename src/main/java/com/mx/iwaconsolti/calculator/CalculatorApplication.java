package com.mx.iwaconsolti.calculator;

import com.mx.iwaconsolti.calculator.ServiceCalculator.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication implements CommandLineRunner {

    @Autowired
    private CalculatorService calculatorService;

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        calculatorService.init();
    }
}
