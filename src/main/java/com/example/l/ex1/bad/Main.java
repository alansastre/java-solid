package com.example.l.ex1.bad;

public class Main {

    public static void main(String[] args) {

        String carType = "electric";

        // este codigo seria el ideal a ejecutar
        Vehicle combustion = new CombustionCar();
        Vehicle electric = new ElectricCar();
        combustion.accelerate();
        electric.accelerate(); // NO ESTARÍA COMPROBANDO LA BATERÍA Y FALLARÍA
//        electric.hasBattery() // INCUMPLE EL PRINCIPIO


        if ("car" == carType) {
            CombustionCar car = new CombustionCar();
            car.accelerate();
        } else if ("electric" == carType) {
        	ElectricCar electricCar = new ElectricCar();
            if (electricCar.hasBattery()) { // Al trabajar con una clase específica tenemos que hacer comprobaciones extra para acelerar
                electricCar.accelerate();
            }
//            Vehicle electricCar = new ElectricCar();
//            electricCar.accelerate(); // no podemos ejecutar esto directamente porque nos estariamos saltando la comprobacion de la bateria
        }else{
            throw new RuntimeException("Invalid car");
        }
    }
    
}
