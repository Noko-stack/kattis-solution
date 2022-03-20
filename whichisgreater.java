package com.kattis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class whichisgreater {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Integer> num= Arrays.asList(sc.nextInt(),sc.nextInt());
        if(num.get(0) >num.get(1)){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
