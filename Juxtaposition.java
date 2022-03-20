package com.kattis;

import java.util.Scanner;

public class Juxtaposition {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

        int d=a*b*c;

        System.out.println(d);
    }
}
