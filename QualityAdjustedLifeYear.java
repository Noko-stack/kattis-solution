package com.kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QualityAdjustedLifeYear {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        float[][] inputUser=new float[n][3];
        float sum=0;

        DecimalFormat f = new DecimalFormat("##.000");

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                inputUser[i][j]=sc.nextFloat();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
               sum+=inputUser[i][j]*inputUser[i][j+1];
            }
        }
        System.out.println(f.format(sum));
    }
}
