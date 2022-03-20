package com.kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        ArrayList<Integer> num=new ArrayList<>();

        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }

        Collections.reverse(num);
        System.out.println(num.toString().replace("[","").replace("]","").replace(",",""));

    }
}
