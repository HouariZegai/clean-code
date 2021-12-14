package com.houarizegai.designpatterns.composite;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    public void testComposite() {
        Component hdd = new Leaf("Hard Drive", 6000);
        Component mouse = new Leaf("Mouse", 500);
        Component monitor = new Leaf("Monitor", 8000);
        Component cpu = new Leaf("CPU", 16000);
        Component ram = new Leaf("RAM", 5000);

        Composite peripherals = new Composite("peripherals");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Mother Board");
        Composite computer = new Composite("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        cabinet.addComponent(motherBoard);
        cabinet.addComponent(hdd);

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);

        computer.addComponent(peripherals);
        computer.addComponent(cabinet);

        // Print only the peripherals
        peripherals.showPrice();

        // Print all composite of computer
        computer.showPrice();
    }
}