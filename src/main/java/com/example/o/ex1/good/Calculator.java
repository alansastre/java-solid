package com.example.o.ex1.good;

import java.util.Objects;

public class Calculator {

    public void calculate(CalculatorOperation operation){
        Objects.requireNonNull(operation);
        operation.perform();
    }
}
