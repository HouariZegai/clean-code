package com.houarizegai.designpatterns.decorator;

public abstract class SandwichDecorator implements Sandwish {
    private Sandwish sandwish;

    public SandwichDecorator(Sandwish sandwish) {
        this.sandwish = sandwish;
    }

    public String getDescription() {
        return this.sandwish.getDescription();
    }

    public double getCost() {
        return this.sandwish.getCost();
    }
}
