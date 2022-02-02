package com.houarizegai.designpatterns.factory;

import org.junit.jupiter.api.Test;

class FactoryTest {

    @Test
    public void testFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square  = shapeFactory.getShape("square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}