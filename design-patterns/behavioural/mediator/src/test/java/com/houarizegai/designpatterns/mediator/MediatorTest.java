package com.houarizegai.designpatterns.mediator;

import org.junit.jupiter.api.Test;

class MediatorTest {


    @Test
    public void mediatorTest() {
        Mediator mediator = new Mediator();

        Light kitchenLight = new Light("Kitchen");
        Light livingRoomLight = new Light("Living room");

        mediator.register(kitchenLight);
        mediator.register(livingRoomLight);

        Command turnOnAllLightCommand = new TurnOnAllLight(mediator);
        turnOnAllLightCommand.execute();

        Command turnOffAllLightCommand = new TurnOffAllLight(mediator);
        turnOffAllLightCommand.execute();
    }
}