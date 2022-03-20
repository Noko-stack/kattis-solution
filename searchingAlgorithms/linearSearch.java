package com.kattis.searchingAlgorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> list= Arrays.asList(19,3,5,6);
        int result=search(list,n);
        if(result!=-1) {
            System.out.println("Found at index " + result);
        }else {
            System.out.println("Element Not found");
        }


    }

    public static int search(List<Integer> list, int n) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return i;
            }
        }
        return -1;
    }
}
