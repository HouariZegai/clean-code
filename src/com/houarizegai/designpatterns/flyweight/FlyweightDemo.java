/*

    Flyweight pattern is primarily used to reduce the number of objects created and to
    decrease memory footprint and increase performance. This type of design pattern comes
    under structural pattern as this pattern provides ways to decrease object count thus
    improving the object structure of application.

    Flyweight pattern tries to reuse already existing similar kind objects by storing them
    and creates new object when no matching object is found. We will demonstrate this pattern
    by drawing 20 circles of different locations but we will create only 5 objects.
    Only 5 colors are available so color property is used to check already existing Circle objects.

*/

package com.houarizegai.designpatterns.flyweight;

public class FlyweightDemo {
    private final static String[] colors = {"Black", "White", "Red", "Green", "Blue"};

    public static void main(String[] args) {
        for(int i = 0; i < 15; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX((int)(Math.random() * 50));
            circle.setY((int)(Math.random() * 50));
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
