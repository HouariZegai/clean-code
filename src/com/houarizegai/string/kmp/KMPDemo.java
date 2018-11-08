package com.houarizegai.string.kmp;

public class KMPDemo {
    public static void main(String[] args) {
        String text = "Hello My houar name hou is houarHouari ZEGAI hoari.";
        String pattern = "houari ";

        KMP kmp = new  KMP(text);

        boolean isFound = kmp.search(pattern);

        System.out.println(isFound ? "Found !" : "Not Found !");

    }
}
