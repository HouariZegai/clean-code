package com.houarizegai.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

interface Component {
    void showPrice();
}

class Leaf implements Component {
    String name;
    int price;

    public Leaf(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + ": " + price);
    }
}

class Composite implements Component {

    String name;
    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(int i = 0; i < components.size(); i++) {
            components.get(i).showPrice();
        }

    }
}
