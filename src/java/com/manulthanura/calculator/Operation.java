package com.manulthanura.calculator;

import java.util.function.DoubleBinaryOperator;

public enum Operation {
    ADDITION((x, y) -> x+y),
    SUBTRACTION((x, y) -> x-y),
    DIVISION((x, y) -> x/y),
    MULTIPLICATION((x, y) -> x*y),
    PERCENTAGE((x, y) -> x%y);


    private DoubleBinaryOperator operator;

    Operation(DoubleBinaryOperator operator) {
       this.operator = operator;
    }

    public DoubleBinaryOperator getOperator() {
        return operator;
    }
}
