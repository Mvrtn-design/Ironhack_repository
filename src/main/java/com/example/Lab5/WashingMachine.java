package com.example.Lab5;

public class WashingMachine extends Appliance implements Electric {
    WashingMachine() {
        super();
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine turned off");
    }

    @Override
    void turnOn() {
        System.out.println("Washing machine turned on");
    }

    @Override
    public void plugIn() {
        System.out.println("The washing machine is been pluged In");
    }

    @Override
    public void unplug() {
        System.out.println("The washing machine is been unpluged");
    }

}
