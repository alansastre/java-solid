package com.example.o.ex1.bad;

public class Calculator {


    public void calculate(CalculatorOperation operation){

        if(operation == null)
            throw new IllegalArgumentException("Invalid operator");

        if(operation instanceof Addition addition){
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if(operation instanceof Subtraction subtraction){
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
        // nos obliga seguir añadiendo aquí los diferentes tipos de operaciones
    }
}
