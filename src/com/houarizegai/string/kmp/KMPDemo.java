package com.houarizegai.string.kmp;

public class KMPDemo {
    public static void main(String[] args) {
        String text = "aabaabaaa";
        String pattern = "";
        KMP kmp = new  KMP();
        System.out.print("Input:\t");
        kmp.printArray(text.toCharArray());
        System.out.print("Output:\t");
        kmp.printArray(kmp.computePrefixArray(text.toCharArray()));
    }
}
