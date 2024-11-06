package com.mx.iwaconsolti.calculator.service;

import com.mx.iwaconsolti.calculator.persistence.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private Sum sumOperation;
    private Minus minusOperation;
    private Multiply multiplyOperation;
    private Divide divideOperation;

    @Autowired
    public CalculatorService(Sum sumOperation, Minus minusOperation, Multiply multiplyOperation, Divide divideOperation){
        this.sumOperation = sumOperation;
        this.minusOperation = minusOperation;
        this.multiplyOperation = multiplyOperation;
        this.divideOperation = divideOperation;
    }

    public double sum(double firstNum, double secondNum){
        return sumOperation.calculate(firstNum,secondNum);
    }
    public double minus(double firstNum, double secondNum){
        return minusOperation.calculate(firstNum,secondNum);
    }

    public double multiply(double firstNum, double secondNum){
        multiplyOperation.setNum1(firstNum);
        multiplyOperation.setNum2(secondNum);
        return multiplyOperation.calculate();

    }

    public double divide(double firstNum, double secondNum){
        return divideOperation.calculate(firstNum,secondNum);
    }
}
