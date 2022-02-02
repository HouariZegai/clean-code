package com.houarizegai.algorithms;

import java.util.Random;

public class Utils {
    public static void displayTable(int[] array) {
        System.out.print("Array:[ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ]");
    }

    public static int[] generateRandomTable(int size, int randomBound) {
        Random random = new Random();
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) { // Init table
            array[i] = random.nextInt(randomBound);
        }
        return array;
    }
}
