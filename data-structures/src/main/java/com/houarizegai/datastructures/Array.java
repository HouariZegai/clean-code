package com.houarizegai.datastructures;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "orange";

        System.out.println(fruits[0]);
        System.out.println(Arrays.toString(fruits));

        int[] years = {2022, 2021, 2020, 2019};
        Arrays.stream(years).forEach(System.out::println);
    }
}
