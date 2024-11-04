package com.calculator.demo.operations.impl;

import com.calculator.demo.operations.IProjectOperation;

public class Divide implements IProjectOperation {
    @Override
    public int Operator(int a, int b) {
        return a/b;
    }
}
