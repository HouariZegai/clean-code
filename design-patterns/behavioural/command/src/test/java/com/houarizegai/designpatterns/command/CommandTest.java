package com.houarizegai.designpatterns.command;

import org.junit.jupiter.api.Test;

class CommandTest {

    @Test
    void testCommand() {
        Light light = new Light(); // receiver
        Switch lightSwitch = new Switch(); // invoker

        Command command = new CommandImpl(light);
        lightSwitch.storeAndExecute(command);
    }
}