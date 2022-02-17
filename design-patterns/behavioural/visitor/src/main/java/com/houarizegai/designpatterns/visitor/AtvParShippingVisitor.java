package com.houarizegai.designpatterns.visitor;

public class AtvParShippingVisitor implements AtvPartVisitor {

    private double shippingCost;

    @Override
    public void visit(Oil oil) {
        shippingCost += 3;
        System.out.println("Oil");
    }

    @Override
    public void visit(Fender fender) {
        shippingCost += 7;
        System.out.println("Fender");
    }

    @Override
    public void visit(Wheel wheel) {
        shippingCost += 11;
        System.out.println("Wheel");
    }

    @Override
    public void visit(PartsOrder partsOrder) {
        System.out.println("Shipping cost: " + shippingCost);
    }
}
