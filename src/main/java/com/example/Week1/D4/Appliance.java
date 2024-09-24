package com.example.Week1.D4;

public abstract class Appliance {
    abstract void turnOn();

    public void turnOff() {
        System.out.println("Appliance is turned off");
    }
}
