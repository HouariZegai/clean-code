package com.houarizegai.designpatterns.strategy.everydaydemo;

import java.util.Collections;
import java.util.List;

public class StrategyEveryDayDemo {

    public static void main(String[] args) {
        List<Person> people = new java.util.ArrayList<>(List.of(
                new Person("Omar", "5700000000", 13),
                new Person("Khalil", "0400000000", 40),
                new Person("Houari", "0700000000", 25)
        ));

        System.out.println("Before sort: " + people);

        Collections.sort(people, (o, o2) -> o.age() - o2.age());
        System.out.println("Sorted by age: " + people);

        Collections.sort(people, (o, o2) -> o.name().compareTo(o2.name()));
        System.out.println("Sorted by name: " + people);
    }
}
