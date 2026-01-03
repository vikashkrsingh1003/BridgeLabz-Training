package com.day02.homeautomation;

public class Appliance implements Controllable {

    private boolean powerStatus;     // internal state (private)
    private double energyUsage;      // units per hour

    // Constructor
    public Appliance(double energyUsage) {
        this.energyUsage = energyUsage;
        this.powerStatus = false;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    @Override
    public void turnOn() {
        powerStatus = true;
        System.out.println("Appliance turned ON");
    }

    @Override
    public void turnOff() {
        powerStatus = false;
        System.out.println("Appliance turned OFF");
    }
}

