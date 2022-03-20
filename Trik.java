package com.kattis;

import java.util.Scanner;

public class Trik {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        char[] inp=input.toCharArray();

        if(inp[inp.length-1]=='A'){
            System.out.println("2");
        }
        else if(inp[inp.length-1]=='B')
        {
            System.out.println("3");
        }
        else if(inp[inp.length-1]=='B'){
            System.out.println("1");

        }

    }
}
