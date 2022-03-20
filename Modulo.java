package com.kattis;

import java.util.*;

public class Modulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();

        for(int i=0;i<10;i++){
            int j=sc.nextInt();
            list.add(j%42);
        }
        System.out.println(list.size());

    }
}
