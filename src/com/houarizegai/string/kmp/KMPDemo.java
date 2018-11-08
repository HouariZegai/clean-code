package com.houarizegai.string.kmp;

public class KMPDemo {
    public static void main(String[] args) {
        String text = "Hello My houar name hou is houarHouari ZEGAI hoari.";
        String pattern = "houari";

        KMP kmp = new  KMP();
        boolean isFound = kmp.substringSearch(text.toLowerCase().toCharArray(), pattern.toCharArray());

        System.out.println(isFound ? "Found !" : "Not Found !");

    }
}
