package com.houarizegai.designpatterns.iterator;

import java.util.Iterator;

public class BikeRepository implements Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository(int capacity) {
        if(capacity < 0)
            throw new IllegalArgumentException();

        this.bikes = new String[capacity];
    }

    public void add(String bike) {
        final int bikesLength = bikes.length;

        if(index == bikesLength) {
            String[] newBikesRepo = new String[bikesLength + 5];
            System.arraycopy(bikes, 0, newBikesRepo, 0, bikesLength);
            bikes = newBikesRepo;
        }

        bikes[index++] = bike;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int iteratorIndex;

            @Override
            public boolean hasNext() {
                return iteratorIndex < bikes.length && bikes[iteratorIndex] != null;
            }

            @Override
            public String next() {
                return bikes[iteratorIndex++];
            }
        };
    }
}
