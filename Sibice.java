package com.kattis;

import java.util.Scanner;

public class Sibice{

    public static void main(String args[]){
        int[] numbers=new int[3];

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        int[] length=new int[numbers[0]];


        for(int i=0;i<numbers[0];i++){
            length[i]=sc.nextInt();
        }
        for(int i=0;i<length.length;i++){
            int square = numbers[1] * numbers[1] + numbers[2] * numbers[2];
            float squareRoot= (float) Math.sqrt(square);
            if((numbers[numbers.length-1]>=length[i])||squareRoot>=length[i]){
                System.out.println("DA");
            }
            else {
                System.out.println("NE");
            }
        }
    }
}
