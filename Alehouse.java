package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alehouse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        List<Integer> list=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();

        int count=0;
        int i=1;
        while(i<n){
            list.add(sc.nextInt());
            list.add(sc.nextInt());
            if(list.get(1)-list.get(0)==k){
                count+=k;
                newList.add(count);
            }
            list.clear();
            i++;
        }
        System.out.println(count);
    }
}
