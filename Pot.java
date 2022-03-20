package com.kattis;

import java.util.Scanner;

public class Pot {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            String s = sc.next();
            String digit = "";
            String power="";
            digit=s.substring(0,s.length()-1);
            power=s.substring(s.length()-1);

            int num= Integer.parseInt(digit);
            int p= Integer.parseInt(power);
             sum+=Math.pow(num,p);
        }
        System.out.println(sum);


    }
}
