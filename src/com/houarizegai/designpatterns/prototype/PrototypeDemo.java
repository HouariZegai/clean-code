package com.houarizegai.designpatterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneCircle = (Shape) ShapeCache.getShape("1");
        cloneCircle.draw();

        Shape cloneSquare = (Shape) ShapeCache.getShape("2");
        cloneSquare.draw();

        Shape cloneRectangle = (Shape) ShapeCache.getShape("3");
        cloneRectangle.draw();

    }
}
