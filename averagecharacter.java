package com.kattis;

import java.util.Scanner;

public class averagecharacter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String alphabets= sc.next();
        char[] alpha=alphabets.toCharArray();

        int sum=0;
        for(int i:alpha){
           sum+=i;
        }
        char val= (char) (sum/alpha.length);
        System.out.println(val);
    }
}
