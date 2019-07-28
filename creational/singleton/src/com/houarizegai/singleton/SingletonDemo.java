package com.houarizegai.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // Error: The Constractor is private (cannot call it)
        //SingletonObject singletonObject = new SingletonObject();

        // get the only object from singleton class
        SingletonObject singletonObject = SingletonObject.getInstance();

        singletonObject.showMsg();
    }
}
