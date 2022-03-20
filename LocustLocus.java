package com.kattis;

import java.util.List;
import java.util.Scanner;

public class LocustLocus {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] input=new int[n][3];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                input[i][j]= sc.nextInt();
            }
        }

        int max=input[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                if (input[i][j]>max){
                    max=input[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
