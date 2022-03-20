package com.kattis;

import java.util.Scanner;

public class Aaah {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        String n2= sc.next();

        if(n1.length()>=n2.length()){
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}
