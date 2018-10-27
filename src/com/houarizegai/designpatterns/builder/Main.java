package com.houarizegai.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setFirstName("Houari")
                .setLastName("ZEGAI")
                .setAge(22)
                .setGender(Gender.MALE)
                .getPerson();

        System.out.println(person);
    }
}
