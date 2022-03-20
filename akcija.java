package com.kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class akcija {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> number=new ArrayList<>();

        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                number.add(sc.nextInt());
            }
            Collections.sort(number);
            sum+=number.get(1)+number.get(2);
            number.clear();
        }
        System.out.println(sum);
    }
}
