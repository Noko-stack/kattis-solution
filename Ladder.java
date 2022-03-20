package com.kattis;

import java.util.Scanner;

public class Ladder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int height= sc.nextInt(); ;
        int angle= sc.nextInt();

        double x=  (height/Math.tan(Math.toRadians(angle)));
        double result= Math.ceil(Math.sqrt((x*x)+(height*height)));
        System.out.println((int)(result));
    }
}
