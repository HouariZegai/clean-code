package com.houarizegai.designpatterns.facade;

import org.junit.jupiter.api.Test;

class FacadeTest {

    @Test
    public void testFacade() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();
        shapeMaker.drawRectangle();
    }
}