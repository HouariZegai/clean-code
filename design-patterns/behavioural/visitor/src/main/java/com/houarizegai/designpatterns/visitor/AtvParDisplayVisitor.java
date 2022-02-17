package com.houarizegai.designpatterns.visitor;

public class AtvParDisplayVisitor implements AtvPartVisitor {
    private double shippingCost;

    @Override
    public void visit(Oil oil) {
        shippingCost += 1;
        System.out.println("Oil display");
    }

    @Override
    public void visit(Fender fender) {
        shippingCost += 2;
        System.out.println("Fender display");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingCost += 3;
        System.out.println("Wheel display");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Display cost: " + shippingCost);
    }
}
