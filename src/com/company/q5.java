package com.company;

public class q5 {
    public static boolean DigitNum(String str, int n)
    {
        // Traverse the string from
        // start to end
        for (int i = 0; i < n; i++) {

            // Check if character is
            // digit from 0-9
            // then return true
            // else false
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    str=str+1;
                    if (str.matches(".*[a-z].*")) {
                        return true;
                    }
                    else {
                        return false;
                    }
            }

            if (str.matches(".*[a-z].*")) {
                str=str+1;
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    return true;
                }
                else {
                    return false;
                }
            }

        }
        return false;
    }

    public static void main(String args[])
    {
        // Given string str
        String str = "1a1a";
        int len = str.length();
        // Function Call
        System.out.println(DigitNum(str, len));
    }



}
