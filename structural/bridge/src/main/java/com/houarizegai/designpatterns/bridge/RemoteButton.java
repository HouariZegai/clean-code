package com.houarizegai.designpatterns.bridge;

public abstract class RemoteButton {

    private EntertainmentDevice device;

    public RemoteButton(EntertainmentDevice device) {
        this.device = device;
    }

    public void onBtn5Pressed() {
        device.onBtn5Pressed();
    }

    public void onBtn6Pressed() {
        device.onBtn6Pressed();
    }

    public void deviceFeedback() {
        device.deviceFeedback();
    }

    public abstract void onBtn9Pressed();
}
