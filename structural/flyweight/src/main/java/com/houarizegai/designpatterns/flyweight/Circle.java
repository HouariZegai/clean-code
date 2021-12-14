package com.houarizegai.designpatterns.flyweight;

public class Circle implements Shape {
    private String color; // color of circle
    private int x, y, radius; // position and redius of circle

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle: {" + color + ", x: " + x + " y: " + y  + " Redius: " + radius + "}");
    }
}
