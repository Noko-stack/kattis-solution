package com.kattis;

import java.util.Arrays;
import java.util.List;

public class frequencies{

    public static void main(String[] args) {

        List<Integer> myList=Arrays.asList(1,2,1);

        boolean[] visited=new boolean[3];
        Arrays.fill(visited,false);

        for(int i=0;i<3;i++){

            if(visited[i]==true)
                continue;

            int count=1;
            for(int j=i+1;j<3;j++){
                if(myList.get(i)==myList.get(j)){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(myList.get(i)+ " "+ count);
        }
    }
}
