package com.kattis;

import java.util.Scanner;

public class NSum {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int[] num=new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            num[i]= sc.nextInt();
            sum+=num[i];
        }
        System.out.println(sum);

    }
}
