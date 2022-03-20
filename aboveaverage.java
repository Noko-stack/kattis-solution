package com.kattis;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aboveaverage {

    private static final DecimalFormat df = new DecimalFormat("0.000");


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int sum=0;
           double num= sc.nextDouble();
            List<Double> list=new ArrayList<>();

            for(int j=0;j<num;j++){
               list.add(sc.nextDouble());
               sum+=list.get(j);
           }
            double average=sum/num;

            int count=0;
            for(int k=0;k<list.size();k++){
              if(list.get(k)>average){
                  count++;
              }
            }
            System.out.println(df.format((count/num)*100)+"%");

            list.clear();

        }

    }
}
