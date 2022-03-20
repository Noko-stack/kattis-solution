package com.kattis;

import java.util.Scanner;

public class NumberFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int i=0;
        while (i<n){

            int[] num = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

            int sum=num[0]+num[1];
            int mul=num[0]*num[1];
            double div=  Math.round((num[0]/num[1])*100.0)/100.0;
            double div1= num[1]/num[0];
            int sub=Math.abs(num[0]-num[1]);

            if(sum==num[2]||num[2]==mul||div1==num[2]||div==num[2]||sub==num[2]){

                System.out.println("Possible");
            }
            else {
                System.out.println("Impossible");
            }
            i++;

        }
    }
}
