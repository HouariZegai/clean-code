package com.houarizegai.designpatterns.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("New Circle of color: " + color);
        }

        return circle;
    }
}
