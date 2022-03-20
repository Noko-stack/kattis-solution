package com.kattis;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[] splited = word.split("\\s+");

        Set<String> names=new HashSet<>();

        String result="";
        for(String i:splited){
            if(names.add(i)==false){
                result="no";
                break;
            }else {
                result="yes";
            }
        }
        System.out.println(result);
    }
}
