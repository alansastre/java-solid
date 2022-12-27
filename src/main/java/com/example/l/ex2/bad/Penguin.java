package com.example.l.ex2.bad;

public class Penguin extends Bird{

    @Override
    public void fly() {
        throw new UnsupportedOperationException();
    }
}
