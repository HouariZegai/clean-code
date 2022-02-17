package com.houarizegai.designpatterns.visitor;

public class Wheel implements AtvParts {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
