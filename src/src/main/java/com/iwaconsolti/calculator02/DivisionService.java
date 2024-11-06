package com.mx.iwaconsolti.calculator02;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class DivisionService implements IOperations {
     @Override
    public double operation(double num1, double num2) {
        if (num1 == 0) {
            System.out.println("No puede dividir por 0");
        }
        return num1 / num2;
    }
}
