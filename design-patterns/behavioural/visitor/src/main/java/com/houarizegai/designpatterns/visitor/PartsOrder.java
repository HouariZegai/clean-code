package com.houarizegai.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder implements AtvParts {

    private List<AtvParts> parts = new ArrayList<>();

    public void add(AtvParts part) {
        parts.add(part);
    }

    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvParts part: parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
