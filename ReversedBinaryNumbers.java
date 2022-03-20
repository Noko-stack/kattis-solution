package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int decimal= sc.nextInt();

        List<Integer> remainder=new ArrayList<>();

        int n=decimal;

        while (n>0){

            remainder.add(decimal%2);
            decimal/=2;
            n=decimal;
        }
        int power= remainder.size()-1;
        int sum=0;

        for(int i=0;i< remainder.size();i++){
            sum+=(remainder.get(i) * Math.pow(2, power));
            power=power-1;
        }
        System.out.println(sum);
    }
}
