package com.company;

import java.util.HashMap;



public class q4 {

    static void checkMagazine(String[] magazine, String[] note) {

        if(note==null){
            System.out.println("false");
            return;
        }

        if(note.length > magazine.length){
            System.out.println("false");
            return;
        }

        HashMap<String, Integer> hm= new HashMap<String, Integer>();
        for(int i=magazine.length-1;i>=0;i--){
            if(hm.containsKey(magazine[i])){
                hm.put(magazine[i], hm.get(magazine[i])+1);
            }else{
                hm.put(magazine[i],1);
            }
        }

        for(int i=note.length-1;i>=0;i--){
            if(hm.containsKey(note[i])){
                hm.put(note[i], hm.get(note[i]) - 1);
                if(hm.get(note[i]) < 0){
                    System.out.println("false");
                    return;
                }
            }else{
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");

    }


}
