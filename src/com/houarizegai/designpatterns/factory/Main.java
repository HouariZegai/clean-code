package com.houarizegai.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle shape
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        // Create Square shape
        Shape square  = shapeFactory.getShape("square");
        square.draw();

        // Create Rectangle shape
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

    }
}
