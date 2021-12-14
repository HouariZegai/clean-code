package com.houarizegai.designpatterns.decorator;

public class BasicSandwish implements Sandwish {

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
