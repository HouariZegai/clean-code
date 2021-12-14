package com.houarizegai.designpatterns.decorator;

public class Fool extends SandwichDecorator {

    public Fool(Sandwish sandwish) {
        super(sandwish);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Fool";
    }
}
