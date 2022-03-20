package com.kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class finalexam2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Integer> list= Arrays.asList(1,2,3,4);

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==7){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
