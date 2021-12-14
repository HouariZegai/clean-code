package com.houarizegai.designpatterns.builder;

import org.junit.jupiter.api.Test;

class BuilderTest {

    @Test
    public void testBuilder() {
        Person person = new Person.Builder()
                .firstName("Houari")
                .lastName("ZEGAI")
                .age(22)
                .gender(Gender.MALE)
                .build();

        System.out.println(person);
    }
}