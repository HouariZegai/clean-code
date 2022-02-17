package com.houarizegai.designpatterns.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        PartsOrder order = new PartsOrder();
        order.add(new Fender());
        order.add(new Oil());
        order.add(new Wheel());

        order.accept(new AtvParShippingVisitor());
        order.accept(new AtvParDisplayVisitor());
    }
}
