package com.kattis;

import java.util.Scanner;

public class Oddities {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] numbers=new int[n];

        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i]+ " is even");
            }else {
                System.out.println(numbers[i]+ " is odd");
            }
        }
    }
}
