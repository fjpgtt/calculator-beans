package com.mx.iwaconsolti.calculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class MultiplicationService {
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
