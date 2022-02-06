package com.houarizegai.designpatterns.mediator;

public class Light { // Receiver

    private boolean isOn;
    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

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
        System.out.format("Light of the %s is turned on!%n", location);
    }

    private void off() {
        System.out.format("Light of the %s is turned off!%n", location);
    }
}
