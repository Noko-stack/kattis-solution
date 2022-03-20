package com.kattis;

import java.util.Scanner;

public class Tarifa{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int sum=0;
        int mb=sc.nextInt();
        int month=sc.nextInt();
        int totalData=mb*(month+1);
        int[] dataUsed=new int[month];

        for(int i=0;i<month;i++){
            dataUsed[i]= sc.nextInt();
        }
        for(int j=0;j<dataUsed.length;j++){
            sum+=dataUsed[j];
        }
        System.out.println(totalData-sum);
    }
}
