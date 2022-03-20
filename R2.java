package com.kattis;

import java.util.Scanner;

public class R2 {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int[] numbers=new int[2];

        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        int R2 = numbers[1] * 2 - numbers[0];
        System.out.println(R2);
    }
}
