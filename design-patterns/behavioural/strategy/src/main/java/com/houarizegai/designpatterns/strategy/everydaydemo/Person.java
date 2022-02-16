package com.houarizegai.designpatterns.strategy.everydaydemo;

public record Person (String name, String phone, int age) {
    @Override
    public String toString() {
        return name;
    }
}
