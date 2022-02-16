package com.houarizegai.designpatterns.state;

import org.junit.jupiter.api.Test;

public class StateTest {

    @Test
    public void testState() {
        Fan fan = new Fan();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
        fan.pullChain();
    }
}