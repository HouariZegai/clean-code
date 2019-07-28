package com.houarizegai.designpatterns.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Shape square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Shape rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
