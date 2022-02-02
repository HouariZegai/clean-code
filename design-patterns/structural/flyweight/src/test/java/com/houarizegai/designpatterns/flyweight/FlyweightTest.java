package com.houarizegai.designpatterns.flyweight;

import org.junit.jupiter.api.RepeatedTest;

class FlyweightTest {

    private final static String[] COLORS = {"Black", "White", "Red", "Green", "Blue"};

    @RepeatedTest(value = 15)
    public void testFlyweight() {
        Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
        circle.setX((int)(Math.random() * 50));
        circle.setY((int)(Math.random() * 50));
        circle.draw();
    }

    private String getRandomColor() {
        return COLORS[(int)(Math.random() * COLORS.length)];
    }
}