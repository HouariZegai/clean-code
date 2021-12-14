package com.houarizegai.designpatterns.prototype;

public class Circle extends Shape {

    public Circle() {
        super.type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Draw Circle!");
    }
}
