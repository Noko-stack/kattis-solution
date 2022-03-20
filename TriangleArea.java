package com.kattis;

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int h= sc.nextInt();
        int b= sc.nextInt();
        float area= (float) (0.5*b*h);
        System.out.println(area);
    }
}
