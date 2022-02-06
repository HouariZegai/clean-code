package com.houarizegai.designpatterns.mediator;

public class TurnOffAllLight implements Command {

    private Mediator mediator;

    public TurnOffAllLight(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void execute() {
        mediator.turnOffAllLight();
    }
}
