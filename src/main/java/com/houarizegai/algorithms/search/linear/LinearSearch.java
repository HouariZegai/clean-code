package com.houarizegai.algorithms.search.linear;

import com.houarizegai.algorithms.Utils;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = Utils.generateRandomTable(10, 20);
        Utils.displayTable(array);

        System.out.println(10 + ":" + linearSearch(array, 10));
        System.out.println(15 + ":" + linearSearch(array, 15));
        System.out.println(0 + ":" + linearSearch(array, 0));

    }

    private static boolean linearSearch(int[] array, int target) {
        for(int i = 0; i < array.length; i++) { // brute force
            if(array[i] == target)
                return true;
        }
        return false;
    }
}
