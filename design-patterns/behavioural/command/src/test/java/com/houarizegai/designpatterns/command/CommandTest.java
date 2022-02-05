package com.houarizegai.designpatterns.command;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void testCommands() {
        Light bedRoomLight = new Light();
        List<Light> lights = Arrays.asList( // receiver
                new Light(),
                bedRoomLight,
                new Light()
        );
        Switch lightSwitch = new Switch(); // invoker

        lightSwitch.storeAndExecute(new ToggleCommand(bedRoomLight));

        Command command = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(command);
    }
}