package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OddManOut {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        List<Integer> result=new ArrayList<>();


        list.add(1);
        list.add(1);
        list.add(2147483647);


        System.out.println(list);

        int count=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j< list.size();j++){
                if(list.get(i)==list.get(j)){

                    result.add(list.get(i));

                }
            }
        }
        System.out.println(result);

    }
}
