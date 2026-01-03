package com.day02.homeautomation;

public class AC extends Appliance {

    AC(double energyUsage) {
        super(energyUsage);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC is cooling ");
    }
}


