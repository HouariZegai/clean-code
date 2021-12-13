package com.houarizegai.designpatterns.singleton;

public class SingletonObject {

    private static SingletonObject singletonObject;

    private SingletonObject() {
    }

    public static SingletonObject getInstance() {
        if (singletonObject == null) {
            singletonObject = new SingletonObject();
        }

        return singletonObject;
    }

    public void greeting() {
        System.out.println("Hello World from singleton!");
    }
}
