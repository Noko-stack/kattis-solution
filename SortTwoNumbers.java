package com.kattis;

import java.util.Arrays;
import java.util.Scanner;

public class SortTwoNumbers {

    public static void main(String args[]){

        int[] numbers=new int[2];
        Scanner sc=new Scanner(System.in);


        for(int i=0;i<numbers.length;i++){
            numbers[i]= sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
