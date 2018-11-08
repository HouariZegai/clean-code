package com.houarizegai.string.kmp;
/*
* The Knuth-Morris-Pratt (KMP) String Matching Algorithm
*
*/
public class KMP {

    public int[] computePrefixArray(char[] pattern) {
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

    public void printArray(int[] array) { // print array of integer
        for(int item : array)
            System.out.print(item + " ");
        System.out.println();
    }

    public void printArray(char[] array) { // print array of integer
        for(char item : array)
            System.out.print(item + " ");
        System.out.println();
    }

}
