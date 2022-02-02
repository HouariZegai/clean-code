package com.houarizegai.designpatterns.decorator;

public class Salt extends SandwichDecorator {
    public Salt(Sandwish sandwish) {
        super(sandwish);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.4;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Salt";
    }
}
