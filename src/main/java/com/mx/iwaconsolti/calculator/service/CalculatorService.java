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

    @Autowired
    private Divide divideOperation;

    @Autowired
    public CalculatorService(Sum sumOperation, Minus minusOperation){
        this.sumOperation = sumOperation;
        this.minusOperation = minusOperation;
    }

    @Autowired
    public void setMultiplyOperation(Multiply multiplyOperation) {
        this.multiplyOperation = multiplyOperation;
    }

    public double sum(double firstNum, double secondNum){
        return sumOperation.calculate(firstNum,secondNum);
    }
    public double minus(double firstNum, double secondNum){
        return minusOperation.calculate(firstNum,secondNum);
    }

    public double multiply(double firstNum, double secondNum){
        return multiplyOperation.calculate(firstNum,secondNum);

    }

    public double divide(double firstNum, double secondNum){
        return divideOperation.calculate(firstNum,secondNum);
    }
}
