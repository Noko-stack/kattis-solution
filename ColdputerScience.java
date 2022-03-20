package com.kattis;

import java.util.Scanner;

public class ColdputerScience {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int temperatures[]=new int[number];
        int count=0;

        for(int i=0;i<temperatures.length;i++){
            temperatures[i]=sc.nextInt();
        }
        for(int j=0;j<temperatures.length;j++){
            if(temperatures[j]<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
