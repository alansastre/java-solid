package com.example.o.ex3.bad;

public class Car {
	
    private String type;

    void accelerate() {
        // mal uso extender el objeto Car modificándolo:
        if(type.equals("SPORT"))
            injectNitro();
        else if (type.equals("FAMILY"))
        	startConfort();

        // accelerate car
    }

    void stop() {
        // stop car
    }

    // mal uso, seguir agregando funcionalidades concretas:

    private void injectNitro() {
        // do..
    }
    
    private void startConfort() {
        // do..
    }
    

}
