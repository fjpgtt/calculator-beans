package com.mx.iwaconsolti.calculator.Operations;

import com.mx.iwaconsolti.calculator.Interface.OperationsInterface;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MultiplyOperation implements OperationsInterface {
//    Method that returns the multiply of two numbers
    @Override
    public double calculate(double a, double b) {
        return (a * b);
    }

    //PostConstruct should be initialized when this bean is created.
    //Testing.
    @PostConstruct
    public void message(){
        System.out.print("Operation multiplication loaded");
    }
}