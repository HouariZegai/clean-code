package com.houarizegai.designpatterns.command;

public class Switch {
    public void storeAndExecute(Command command) {
        command.execute();
    }
}
