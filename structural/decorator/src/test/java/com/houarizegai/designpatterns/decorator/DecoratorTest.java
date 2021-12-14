package com.houarizegai.designpatterns.decorator;

import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    public void testDecorator() {
        Sandwish basicSandwish = new Fool(new Salt(new BasicSandwish()));

        System.out.println("Description: " + basicSandwish.getDescription());

        // %.2f: Get only 2 decimal value from double
        System.out.printf("Cost: %.2f\n", basicSandwish.getCost());
    }
}