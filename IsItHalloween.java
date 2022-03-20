package com.kattis;

import java.util.Scanner;

public class IsItHalloween {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String d= sc.nextLine();

        if(d.contains("OCT 31")||d.contains("DEC 25")){
            System.out.println("yup");
        }else {
            System.out.println("nope");
        }

    }
}
