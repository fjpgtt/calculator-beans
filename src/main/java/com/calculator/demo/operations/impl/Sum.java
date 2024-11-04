package com.calculator.demo.operations.impl;

import com.calculator.demo.operations.IProjectOperation;
import org.springframework.stereotype.Component;

@Component("Sum")
public class Sum implements IProjectOperation {

    @Override
    public int Operator(int a, int b) {
        return a+b;
    }
}
