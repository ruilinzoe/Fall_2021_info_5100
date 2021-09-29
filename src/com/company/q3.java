package com.company;

import java.util.Arrays;

public class q3 {

//    Question 3:
//    Find first non repeated integer in an array.
//    Example: int[] arr = {2,3,4,2,2,3,5,7}
//    Output : 4

    static int findNonRepeat(int Array3[], int n) {
        Arrays.sort(Array3);
        int special = Array3[0];

        for (int i = 0; i < n; i++) {
            if (Array3[i] != Array3[i + 1]) {
                special = Array3[i];
            }

        }
        return special;
    }

    public static void main(String[] args) {
        // write your code here
        int Array3[] = {2, 2, 3, 4, 7, 7, 9, 11, 11, 9};
        int n = Array3.length;
        System.out.println(findNonRepeat(Array3, n));
    }
}
