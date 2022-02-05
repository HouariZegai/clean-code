package com.houarizegai.designpatterns.command;

public class Light {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if(isOn) {
            off();
            isOn = false;
        } else {
            on();
            isOn = true;
        }
    }

    private void on() {
        isOn = true;
        System.out.println("Light switched on.");
    }

    private void off() {
        isOn = false;
        System.out.println("Light switched off.");
    }
}
