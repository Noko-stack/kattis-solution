package com.kattis;

import java.util.*;

public class bookingaroom {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int room= sc.nextInt();
        int booked= sc.nextInt();
        Set<Integer> bookedArray=new HashSet<>();
        List<Integer> available=new ArrayList<>();

        for(int i=0;i<booked;i++){
            bookedArray.add(sc.nextInt());
        }

        for(int i=1;i<=room;i++){
            if(!bookedArray.contains(i)){
                available.add(i);
            }
        }
        if(available.isEmpty()){
            System.out.println("too late");
        }else {
            System.out.println(available.get(0));
        }
    }
}