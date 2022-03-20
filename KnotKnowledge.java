package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnotKnowledge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> total=new ArrayList<>();
        List<Integer> learned=new ArrayList<>();
        List<Integer> dif=new ArrayList<>();

        int n=sc.nextInt();

        int sum=0;
        for(int i=0;i<n;i++){
            total.add(sc.nextInt());
            sum+=total.get(i);

        }
        int esum=0;
        for (int i=0;i<n-1;i++){
            learned.add(sc.nextInt());
            esum+=learned.get(i);
        }

        System.out.println(sum-esum);
    }
}
