package com.houarizegai.designpatterns.command;

import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void testCommand() {
        Light bedRoomLight = new Light(); // receiver
        Switch lightSwitch = new Switch(); // invoker

        Command command = new ToggleCommand(bedRoomLight);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
        lightSwitch.storeAndExecute(command);
    }
}