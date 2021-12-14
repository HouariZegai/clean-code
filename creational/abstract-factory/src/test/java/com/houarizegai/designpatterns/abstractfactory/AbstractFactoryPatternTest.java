package com.houarizegai.designpatterns.abstractfactory;

import org.junit.jupiter.api.Test;

class AbstractFactoryPatternTest {

    @Test
    public void testAbstractFactory() {
        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        // Get shape circle object
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        // Get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color1 = colorFactory.getColor("red");
        color1.fill();

        Color color2 = colorFactory.getColor("blue");
        color2.fill();

        Color color3 = colorFactory.getColor("green");
        color3.fill();
    }
}