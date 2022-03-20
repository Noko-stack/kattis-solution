package com.kattis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class gcvwr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> num= Arrays.asList(sc.nextInt(),sc.nextInt(),sc.nextInt());

        int sum=0;
        for(int i=0;i<num.get(2);i++){
            sum+=sc.nextInt();
        }
        int n= (int) (0.9*(num.get(0)-num.get(1)));

        System.out.println(n-sum);

    }
}
