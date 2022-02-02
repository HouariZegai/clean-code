package com.houarizegai.designpatterns.bridge;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void onBtn9Pressed() {
        System.out.println("TV was paused.");
    }
}
