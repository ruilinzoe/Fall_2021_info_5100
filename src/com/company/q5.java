package com.company;

import javax.xml.transform.Result;

public class q5 {
    public static boolean DigitNum(String str){
        boolean m=true;
        boolean n=true;

        for(int i=0; i<str.length()-1; i++){
            m=Character.isDigit(str.charAt(i));
            n=Character.isDigit(str.charAt(i+1));
            if (m==n){
                return false;
            }
        }
        return true;
        // Traverse the string from
        // start to end

    }

    public static void main(String args[])
    {
        // Given string str
        String str = "a1a1";
        int len = str.length();
        // Function Call
        System.out.println(DigitNum(str));
    }



}
