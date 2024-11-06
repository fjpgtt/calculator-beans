package com.mx.iwaconsolti.calculator02;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MultiplicationService implements IOperations{
    private double num1;
    private double num2;

    @Override
    public double operation(double num1, double num2) {
        return num1 * num2;
    }

}

