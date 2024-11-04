package com.calculator.demo;

import com.calculator.demo.operations.IProjectOperation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Access {

    private IProjectOperation Sum;
    private IProjectOperation Subs;
    private IProjectOperation Mul;
    private IProjectOperation Div;

    public Access(@Qualifier("Sum") IProjectOperation Sum, @Qualifier("Subs")IProjectOperation Subs, @Qualifier("Mul")IProjectOperation Mul, @Qualifier("Div")IProjectOperation Div) {
        this.Sum = Sum;
        this.Subs = Subs;
        this.Mul = Mul;
        this.Div = Div;
    }

    public int calculateSum(int a, int b) {
        return Sum.Operator(a, b);
    }

    public int calculateSubs(int a, int b) {
        return Subs.Operator(a, b);
    }

    public int calculateMul(int a, int b) {
        return Mul.Operator(a, b);
    }

    public int calculateDiv(int a, int b) {
        return Div.Operator(a, b);
    }


}
