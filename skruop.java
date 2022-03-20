package com.kattis;

import java.util.Scanner;

public class skruop {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=7;
        int pos=0;
        int neg=0;

        int n= sc.nextInt();
        for(int i=0;i<n;i++){

            String name= sc.nextLine();

            if(name.equals("Skru op!")){
                pos+=1;
            }
            else {
                neg+=1;
            }
        }
        System.out.println(count+pos-neg);

    }
}
