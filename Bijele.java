package com.kattis;

import java.util.Scanner;

public class Bijele {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] have=new int[6];
        int[] need={1,1,2,2,2,8};

        for(int i=0;i<6;i++){
           have[i]= sc.nextInt();
        }
        for(int i=0;i<6;i++){
            int i1 = need[i] - have[i];
            System.out.println(i1);
        }
    }
}
