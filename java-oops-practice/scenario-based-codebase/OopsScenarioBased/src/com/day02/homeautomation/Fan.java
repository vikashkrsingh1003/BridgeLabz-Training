package com.day02.homeautomation;

public class Fan extends Appliance {

   public Fan(double energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan is spinning ");
    }
}

