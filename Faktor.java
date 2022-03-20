package com.kattis;

import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt()-1;

        System.out.println(n1*n2+1);

    }
}
