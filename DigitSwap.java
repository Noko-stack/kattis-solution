package com.kattis;

import java.util.Scanner;

public class DigitSwap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*
        int n= sc.nextInt();
*/
        int n= 105;

        int rev = 0; // reversed number
        int rem;   // remainder

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }
        System.out.println(rev);

    }
}
