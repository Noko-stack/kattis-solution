package com.kattis;

import java.util.Scanner;

public class QuadrantSelection {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int[] quadrant=new int[2];

        for(int i=0;i<quadrant.length;i++){
            quadrant[i]= sc.nextInt();
        }

        if(quadrant[0]>0 && quadrant[1]>0){
            System.out.println("1");
        }
        else if(quadrant[0]>0 && quadrant[1]<0){
            System.out.println("4");
        }else if(quadrant[0]<0&&quadrant[1]>0){
            System.out.println("2");
        }else{
            System.out.println("3");
        }

    }
}
