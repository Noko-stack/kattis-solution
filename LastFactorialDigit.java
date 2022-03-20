package com.kattis;

import java.util.Scanner;

public class LastFactorialDigit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x= sc.nextInt();
        int i=0;
        while (i<x){
            int n= sc.nextInt();
            int fact=1;
            for(int j=1;j<=n;j++){
                fact*=j;
            }
            System.out.println(fact%10);
            i++;
        }
    }
}
