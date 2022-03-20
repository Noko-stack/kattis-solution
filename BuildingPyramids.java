package com.kattis;

import java.util.Scanner;

public class BuildingPyramids {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int height= sc.nextInt();

        int sum=0;

        for(int i=0;i<height;i++){
            if((i%2)!=0){
                sum += (i * i);
            }
        }
        System.out.println(sum);
    }
}
