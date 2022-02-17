package com.houarizegai.designpatterns.visitor;

public class Oil implements AtvParts {
    @Override
    public void accept(AtvPartVisitor visitor) {
        visitor.visit(this);
    }
}
