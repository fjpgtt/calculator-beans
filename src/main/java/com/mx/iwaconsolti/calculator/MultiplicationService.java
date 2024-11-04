package com.mx.iwaconsolti.calculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MultiplicationService {
    private double num1;
    private double num2;

    public double multiply() {
        return num1 * num2;
    }
}
