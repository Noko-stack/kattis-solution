package com.kattis;

import java.util.*;

public class sortofsorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<String> names=new ArrayList<>();

        int n=sc.nextInt();

        while (n!=0){

            for(int i=0;i<n;i++){
                names.add(sc.next());
            }
            Collections.sort(names);
            for(String na:names){
                System.out.println(na);
            }
            System.out.println(" ");
            names.clear();
            n= sc.nextInt();
        }
    }
}
