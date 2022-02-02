package com.houarizegai.designpatterns.prototype;

public class Square extends Shape {

    public Square() {
        super.type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Draw Square!");
    }
}
