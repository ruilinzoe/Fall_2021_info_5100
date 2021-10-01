package com.company;

import java.util.Arrays;

public class q3 {

//    Question 3:
//    Find first non repeated integer in an array.
//    Example: int[] arr = {2,3,4,2,2,3,5,7}
//    Output : 4

    static int findNonRepeat(int Array3[], int n) {
        for(int i=0; i<n; i++){
            int j;
            for (j=0; j<n; j++) {
                if (i != j &&Array3[i] == Array3[j]){
                    break;
                }
            }
            if (j==n){
                return Array3[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // write your code here
        int Array3[] = {2, 2, 3, 4, 7, 7, 3, 4, 11, 1};
        int n = Array3.length;
        System.out.println(findNonRepeat(Array3, n));
    }
}
