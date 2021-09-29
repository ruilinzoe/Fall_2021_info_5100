package com.company;

import java.util.Arrays;

public class Main {

    static int findSum(int Array[], int n){
        Arrays.sort(Array);

        int sum=Array[0];
        for(int i=0; i<n-1; i++) {
            if (Array[i] != Array[i + 1]) {
                sum = sum + Array[i + 1];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
	// write your code here
        int Array[]={1,2,3,4};
        int n = Array.length;
        System.out.println(findSum(Array, n));
    }
}
