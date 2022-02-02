package com.houarizegai.designpatterns.abstractfactory;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.printf("Inside Green:fill() method.");
    }
}
