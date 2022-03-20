package com.kattis.sortingAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class linearSorting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list= Arrays.asList(3,2,1);

        for(int i=0;i<list.size();i++){
            int smallest=0;
            int largest=0;
            for(int j=i+1;j< list.size();j++){
                if(list.get(i)>list.get(j)){
                    smallest=list.get(j);
                }
            }
        }

    }
}
