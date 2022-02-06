package com.houarizegai.designpatterns.mediator;

public class TurnOnAllLight implements Command {

    private Mediator mediator;

    public TurnOnAllLight(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOnAllLights();
    }
}
