package com.houarizegai.designpatterns.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        super.type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle!");
    }
}
