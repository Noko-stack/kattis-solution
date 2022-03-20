package com.kattis;

import java.util.Arrays;
import java.util.Scanner;

public class PieceOfCake {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] data=new int[3];

        for(int i=0;i<data.length;i++){
            data[i]= sc.nextInt();
        }
        int length=data[0];
        int horizontal=data[1];
        int vertical=data[2];
        int height=4;

        int[] option=new int[4];

         option[0]=horizontal*vertical*height;
         option[1]=(length-horizontal)*vertical*height;
         option[2]=horizontal*(length-vertical)*height;
         option[3]=(length-horizontal)*(length-vertical)*height;

        Arrays.sort(option);
        System.out.println(option[3]);

    }
}
