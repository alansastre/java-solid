package com.example.l.ex1.good;

public class CombustionCar implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }
}
