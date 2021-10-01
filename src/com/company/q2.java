package com.company;

import java.util.Arrays;

public class q2 {
    static void sortSquare(int[] Array2){
        int n= Array2.length;
        for(int i =0; i<n; i++) {
            Array2[i] = Array2[i] * Array2[i];
        }
        Arrays.sort(Array2);
    }

    public static void main(String[] args){
        int array[]={-1,0,-3,5,-4};
        int n=array.length;

        sortSquare(array);

        System.out.println("After sorting, it becomes ");
        for (int i=0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}
