package com.houarizegai.designpatterns.command;

public class CommandImpl implements Command {

    private Light light;

    public CommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
