package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class towering {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();
        List<Integer> newList2=new ArrayList<>();

        for(int i=0;i<6;i++){
            list.add(sc.nextInt());
        }
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                for(int k=i+2;k<list.size();i++){
                    if(list.get(i)+list.get(j)+list.get(k)==n1){
                       newList.add(list.get(k));
                    }else {
                        newList2.add(list.get(k));
                    }
                }
            }
        }
        System.out.println(newList);
        System.out.println(newList2);
    }
}
