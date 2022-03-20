package com.kattis;

import java.util.Scanner;

public class Pet {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[5][4];

        int position=0;
        int highest=0;

        for (int i = 0; i < 5; i++) {
            int sum=0;
            for (int j = 0; j < 4; j++) {
                scores[i][j] = sc.nextInt();
                sum+=scores[i][j];
            }
            if(sum>highest){
                highest=sum;
                position=i+1;
            }
        }
        System.out.println( position+" "+highest);
    }
}
