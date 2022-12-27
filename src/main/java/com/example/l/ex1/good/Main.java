package com.example.l.ex1.good;

public class Main {

    public static void main(String[] args) {

        String carType = "electric";

        // este codigo seria el ideal a ejecutar
        Vehicle combustion = new CombustionCar();
        Vehicle electric = new ElectricCar();
        combustion.accelerate();
        electric.accelerate(); // NO ESTARÍA COMPROBANDO LA BATERÍA Y FALLARÍA

    }
    
}
