package com.houarizegai.algorithms.search.linearsearch;

import com.houarizegai.algorithms.search.Utils;

public class LinearSearch { // brute force
    public static void main(String[] args) {
        int[] numbers = Utils.generateRandomTable(10, 20);
        Utils.displayTable(numbers);

        int target = 10; // search number
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target) {
                System.out.println("Found it at position: " + i);
                break;
            }
        }
    }
}
