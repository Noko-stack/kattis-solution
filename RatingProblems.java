package com.kattis;

import java.util.Scanner;

public class RatingProblems {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        int[] judges=new int[2];
        float sum=0;

        for(int i=0;i<judges.length;i++){
            judges[i]= sc.nextInt();;
        }
        int max=3*(judges[0]-judges[1]);
        int min=-3*(judges[0]-judges[1]);

        int[] points=new int[judges[1]];

        for(int i=0;i<judges[1];i++){
            points[i]= sc.nextInt();
        }

        for(int j=0;j<points.length;j++){
            sum+=points[j];
        }
        System.out.println((min+sum)/judges[0]+" "+ (max+sum)/judges[0]);

    }
}
