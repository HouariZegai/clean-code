package com.houarizegai.designpatterns.bridge;

public class TvDevice extends EntertainmentDevice {

    public TvDevice(int deviceState, int maxSetting) {
        super(deviceState, maxSetting);
    }

    @Override
    public void onBtn5Pressed() {
        System.out.println("Channel down!");
        setDeviceState(getDeviceState() - 1);
    }

    @Override
    public void onBtn6Pressed() {
        System.out.println("Channel up!");
        setDeviceState(getDeviceState() + 1);
    }
}
