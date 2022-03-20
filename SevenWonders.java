package com.kattis;

import java.util.Scanner;

public class SevenWonders {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String input= sc.next();

        int T=0;
        int C=0;
        int G=0;
        int smallest;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='T'){
                T++;
            }else if(input.charAt(i)=='C'){
                C++;
            }else if(input.charAt(i)=='G'){
                G++;
            }

        }
       if(T<=C&&T<=G)
           smallest=T;  
       else if(C<=G)
           smallest=C;
       else
           smallest=G;

       T*=T;
       G*=G;
       C*=C;

        System.out.println((7*smallest)+T+G+C);

    }
}
