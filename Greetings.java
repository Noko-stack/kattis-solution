package com.kattis;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //hey
        int count=0;
        String input= sc.next();
        char[] letter=input.toCharArray();

        for(int i=0;i<letter.length;i++){
            if(letter[i]=='e'){
                count++;
            }
        }
        List<String> eChar=new ArrayList<>();
        for(int i=0;i<count*2;i++){
            eChar.add("e");
        }

        String name=eChar.toString().replace("[", "").replace("]", "").replace(",","").replace(" ","");

        System.out.println("h"+name+ "y");

    }
}
