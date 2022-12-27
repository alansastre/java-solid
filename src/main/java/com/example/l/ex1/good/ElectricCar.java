package com.example.l.ex1.good;

public class ElectricCar implements Vehicle {

    private int battery;

    @Override
    public void accelerate() {
        if(hasBattery())
            System.out.println("accelerating the car");
    }

    @Override
    public void stop() {
        System.out.println("accelerating the car");
    }

    public boolean hasBattery() {
        System.out.println("checking battery");
        if (battery < 95) {
            System.out.println("the battery is very low :(");
            return false;
        } else {
            System.out.println("battery OK :)");
            return true;
        }
    }
}
