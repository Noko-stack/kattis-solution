package com.kattis.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nastyhacks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                list.add(sc.nextInt());
            }
            if(list.get(0)<(list.get(1)-list.get(2))){
                System.out.println("advertise");
            }else if(list.get(0)==(list.get(1)-list.get(2))){
                System.out.println("does not matter");
            }else {
                System.out.println("do not advertise");
            }
            list.clear();
        }
    }
}
