package com.mx.iwaconsolti.calculator.persistence.model;

import org.springframework.stereotype.Component;

@Component
public class Multiply {
    private double num1, num2;

    public void setNum1(double num1){
        this.num1 = num1;
    }

    public void setNum2(double num2){
        this.num2 = num2;
    }

    public double calculate(){
        return num1 * num2;
    }
}
