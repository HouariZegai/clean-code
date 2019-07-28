package com.houarizegai.designpatterns.singleton;

public class SingletonObject { // This class create only one object
    private static SingletonObject singletonObject;

    // Make constractor private (any class can't instantialed)
    private SingletonObject() {

    }

    // Get the only object of this class
    public static SingletonObject getInstance() {
        if(singletonObject == null) {
            singletonObject = new SingletonObject();
        }

        return singletonObject;
    }

    // Show "Hello World" Message
    public void showMsg() {
        System.out.println("Hello World from singleton !");
    }
}
