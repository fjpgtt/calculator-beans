package com.mx.iwaconsolti.calculator.ServiceCalculator;

import com.mx.iwaconsolti.calculator.Operations.AddOperation;
import com.mx.iwaconsolti.calculator.Operations.DivideOperation;
import com.mx.iwaconsolti.calculator.Operations.MinusOperation;
import com.mx.iwaconsolti.calculator.Operations.MultiplyOperation;

public class CalculatorService {
    private final AddOperation addOperation;
    private final DivideOperation divideOperation;
    private final MinusOperation minusOperation;
    private final MultiplyOperation multiplyOperation;

    public CalculatorService(AddOperation addOperation, DivideOperation divideOperation, MinusOperation minusOperation, MultiplyOperation multiplyOperation){
        this.addOperation = addOperation;
        this.divideOperation = divideOperation;
        this.minusOperation = minusOperation;
        this.multiplyOperation = multiplyOperation;
    }
}
