package com.kattis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicTrick {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String characters= "happy";

        //convert string to character array
        char[] word=characters.toCharArray();

        Map<Character,Integer> duplicateEntry=new HashMap<>();

        for(char n:word){
            if(duplicateEntry.containsKey(n)){
                //get value by key and increment it by 1
                duplicateEntry.put(n,duplicateEntry.get(n)+1);
            }else {
                duplicateEntry.put(n,1);
            }
        }

        String result="";

        for (Map.Entry<Character,Integer> entry: duplicateEntry.entrySet()){
            if(entry.getValue()>1){
                result="0";
                break;
            }else {
                result="1";
            }
        }
        System.out.println(result);
    }
}
