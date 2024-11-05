package com.calculator.demo.operations.impl;

import com.calculator.demo.operations.IProjectOperation;

public class Multiply implements IProjectOperation {
    @Override
    public int Operator(int a, int b) {
        return a*b;
    }
}
