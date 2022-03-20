package com.kattis;

import java.util.Scanner;

public class SolvingforCarrots {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int[] number=new int[2];

        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<number[0];i++){
            String name= sc.next();
        }
        System.out.println(number[number.length-1]);
    }
}
