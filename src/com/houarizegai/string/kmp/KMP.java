package com.houarizegai.string.kmp;
/*
* The Knuth-Morris-Pratt (KMP) String Matching Algorithm
* (Substring Search)
* Time Complexity is: O(X + Y) where
*   X is length of text (text.length) &
*   Y is length of pattern (pattern.length)
*/
public class KMP {

    private final char[] TEXT;

    public KMP(String text) {
        TEXT = text.toLowerCase().toCharArray();
    }

    private int[] computePrefixArray(char[] pattern) { // Calculate table of prefix
        int[] result = new int[pattern.length];
        result[0] = 0;
        for(int i = 1; i < result.length; i++)
            result[i] = -1;
        int i = 1;
        int j = 0;

        while(i < pattern.length) {
            if(pattern[i] == pattern[j]) {
                result[i] = j + 1;
                i++;
                j++;
            } else {
                if(j == 0) {
                    result[i++] = 0;
                } else {
                    j = result[j - 1];
                }
            }
        }

        return result;
    }

    public boolean search(String inputPattern) {
        char[] pattern = inputPattern.toLowerCase().toCharArray();

        int[] prefixArrayOfPattern = computePrefixArray(pattern);

        int indexOfText = 0; // Index of Text table
        int indexOfPattern = 0; // Index of Pattern table

        while(indexOfText < TEXT.length && indexOfPattern < pattern.length) {
            if (TEXT[indexOfText] == pattern[indexOfPattern]) {
                indexOfText++;
                indexOfPattern++;
                continue;
            } else {
                if(indexOfPattern == 0) {
                  indexOfText++;
                } else {
                    indexOfPattern = prefixArrayOfPattern[indexOfPattern - 1];
                }
            }

        }

        return indexOfPattern == pattern.length;

    }

    /* Additional Methods */

    public void printArray(int[] array) { // print array of integer
        for(int item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public void printArray(char[] array) { // print array of char
        for(char item : array)
            System.out.print(item + " ");
        System.out.println();
    }

}
