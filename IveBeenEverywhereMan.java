package com.kattis;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IveBeenEverywhereMan {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        Set<String> cities=new HashSet<>();
        int testCase=input.nextInt();
        for(int i=0;i<testCase;i++){
            int n=input.nextInt();
            for(int j=0;j<n;j++){
                cities.add(input.next());
            }
            System.out.println(cities.size());
            cities.clear();
        }

    }
}
