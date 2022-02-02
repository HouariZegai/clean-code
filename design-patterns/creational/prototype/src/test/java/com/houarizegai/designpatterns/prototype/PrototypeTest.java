package com.houarizegai.designpatterns.prototype;

import org.junit.jupiter.api.Test;

class PrototypeTest {

    @Test
    public void testPrototype() {
        ShapeCache.loadCache();

        Shape cloneCircle = (Shape) ShapeCache.getShape("1");
        cloneCircle.draw();

        Shape cloneSquare = (Shape) ShapeCache.getShape("2");
        cloneSquare.draw();

        Shape cloneRectangle = (Shape) ShapeCache.getShape("3");
        cloneRectangle.draw();
    }
}