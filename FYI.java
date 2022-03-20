package com.kattis;

import java.util.Scanner;

public class FYI {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String mobileNumber=sc.nextLine();
        if(mobileNumber.startsWith("555")){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
