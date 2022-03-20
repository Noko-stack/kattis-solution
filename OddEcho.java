package com.kattis;

import java.util.Scanner;

public class OddEcho{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];

        for(int i=0;i<n;i++){
           words[i]= sc.next();
        }

        for(int i=0;i<words.length;i=i+2){
            System.out.println(words[i]);
        }
    }
}
