package com.houarizegai.designpatterns.visitor;

public class Fender implements AtvParts {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
