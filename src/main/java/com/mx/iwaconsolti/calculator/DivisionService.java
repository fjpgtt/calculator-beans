package com.mx.iwaconsolti.calculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DivisionService {
    private double num1;
    private double num2;

    public double divide() {
        if (num2 == 0) {
            System.out.println("No puede dividir por 0");
        }
        return num1 / num2;
    }
}
