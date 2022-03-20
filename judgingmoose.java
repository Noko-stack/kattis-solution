package com.kattis;

import java.util.Scanner;

public class judgingmoose {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2= sc.nextInt();
        int sum=n1+n2;

        if(n1==0&&n2==0){
            System.out.println("Not a moose");
        }
        else if (n1==n2){
            System.out.println("Even " +sum);
        }
        else {
            if(n1>n2){
                System.out.println("Odd " +2*n1);
            }else {
                System.out.println("Odd " +2*n2);
            }
        }

    }
}
