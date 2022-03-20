package com.kattis;

import java.util.Scanner;

public class JumboJavelin {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] num=new int[n];
        int sum=0;
        int value=n-1;

        for(int i=0;i<num.length;i++){
            num[i]= sc.nextInt();
        }

        for(int j=0;j< num.length;j++){
            sum+=num[j];
        }
        System.out.println(sum-value);

    }
}
