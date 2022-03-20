package com.kattis;

import java.util.Scanner;

public class NastyHacks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i=0;
        while (i<n){

            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();

            if(a<(b-c)){
                System.out.println("advertise");
            }
            else if(a>(b-c)){
                System.out.println("do not advertise");
            }

            else if(a==(b-c)){
                System.out.println("does not matter");
            }

            i++;

        }
    }
}
