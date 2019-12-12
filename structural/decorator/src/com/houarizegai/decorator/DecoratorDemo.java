package com.houarizegai.decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        Sandwish basicSandwish = new Fool(new Salt(new BasicSandwish()));

        System.out.println("Description: " + basicSandwish.getDescription());
        System.out.printf("Cost: %.2f\n", basicSandwish.getCost()); // %.2f: Get only 2 decimal value from double
    }
}
