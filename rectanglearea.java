package com.kattis;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class rectanglearea {

    private static final DecimalFormat df = new DecimalFormat("0.000");


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        List<Double> list= Arrays.asList(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double a=list.get(2)-list.get(0);
        double b=list.get(3)-list.get(1);
        double mul=Math.abs(a*b);
        System.out.println(df.format(mul));

    }
}
