package com.mx.iwaconsolti.calculator;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DivisionService {
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No puede dividir por 0");
        }
        return num1 / num2;
    }
}
