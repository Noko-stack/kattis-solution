package com.kattis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class acm {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Map<String,Integer> myMap=new HashMap<>();

        boolean visited[]=new boolean[8];
        Arrays.fill(visited,false);

        int sum=0;
        for(int i=0;i<8;i++){

            if(visited[i])
                continue;

            int count=1;
            String word= sc.nextLine();
            String[] w=word.split(" ");
            int time=Integer.parseInt(w[0]);
            if(!visited[i]){
                myMap.put(w[1],1);
                visited[i]=true;
                sum+=time;
            }
            else {
                myMap.put(w[1],count++);
            }
        }
        System.out.println(sum);
    }
}
