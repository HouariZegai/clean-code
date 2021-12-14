package com.houarizegai.designpatterns.bridge;

public class TVRemoteMute extends RemoteButton {

    public TVRemoteMute(EntertainmentDevice device) {
        super(device);
    }

    @Override
    public void onBtn9Pressed() {
        System.out.println("TV was muted.");
    }

}
