package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElectricalOutlets {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();

        int input= sc.nextInt();

        for(int x=0;x<input;x++){

            int a= sc.nextInt();

            for(int i=0;i<a;i++){
                list.add(sc.nextInt());
            }
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            System.out.println(sum-(list.size()-1));

        }

    }
}
