package com.kattis;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String original=sc.next();
        String filtered="";
        char previousChar=' ';

        for(int i=0;i<original.length();i++){
            if(previousChar!= original.charAt(i)){
                filtered=filtered+original.charAt(i);
            }
            previousChar=original.charAt(i);
        }
        System.out.println(filtered);

    }
}
