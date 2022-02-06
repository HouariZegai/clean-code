package com.houarizegai.designpatterns.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class IteratorTest {

    @Test
    public void testIterator() {
        BikeRepository bikeRepo = new BikeRepository(5);
        bikeRepo.add("A");
        bikeRepo.add("B");
        bikeRepo.add("C");

        Iterator<String> iterator = bikeRepo.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        for (String bike : bikeRepo) {
            System.out.println(bike);
        }
    }
}
