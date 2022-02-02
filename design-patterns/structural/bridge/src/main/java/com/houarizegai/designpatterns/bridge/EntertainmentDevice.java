package com.houarizegai.designpatterns.bridge;

public abstract class EntertainmentDevice {
    private int deviceState;
    private int maxSetting;
    private int volumeLevel = 0;

    public EntertainmentDevice(int deviceState, int maxSetting) {
        this.deviceState = deviceState;
        this.maxSetting = maxSetting;
    }

    public int getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(int deviceState) {
        this.deviceState = deviceState;
    }

    public int getMaxSetting() {
        return maxSetting;
    }

    public void setMaxSetting(int maxSetting) {
        this.maxSetting = maxSetting;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public abstract void onBtn5Pressed();

    public abstract void onBtn6Pressed();

    public void deviceFeedback() {
        if(deviceState > maxSetting || deviceState < 0)
            deviceState = 0;
        System.out.println("On " + deviceState);
    }

    public void onBtn7Pressed() {
        volumeLevel++;
        System.out.println("Volume at: " + volumeLevel);
    }

    public void onBtn8Pressed() {
        volumeLevel--;
        System.out.println("Volume at: " + volumeLevel);
    }

}
