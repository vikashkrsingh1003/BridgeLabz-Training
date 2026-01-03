package com.day02.homeautomation;

public class Light extends Appliance {

   public Light(double energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Light is ON ");
    }
}

