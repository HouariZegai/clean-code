package com.houarizegai.datastructures;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        char[][] names1 = new char[3][];
        names1[1] = new char[2];
        names1[1][0] = 'a';

        System.out.println(Arrays.deepToString(names1));

        char[][] names2 = new char[][]{
                new char[]{'1', '-'},
                new char[]{'2', 'h'},
                new char[]{'3', 'z'},
        };

        System.out.println(Arrays.deepToString(names2));
    }
}
