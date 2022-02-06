package com.houarizegai.designpatterns.iterator;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaIteratorTest {

    @Test
    void testListIterator() {
        List<String> names = Arrays.asList("Houari", "Mohamed", "Omar");

        final Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
