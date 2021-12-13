package com.houarizegai.designpatterns.singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    public void testSingleton() {
        // compile error: constructor is private (cannot call it)
//        SingletonObject singletonObject = new SingletonObject();

        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.greeting();
    }
}