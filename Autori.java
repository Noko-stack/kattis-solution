package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autori{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Character> lastList=new ArrayList<>();
        String word=sc.next();
        String [] splittedWord=word.split("-");
        for(int i=0;i<splittedWord.length;i++){
            lastList.add(splittedWord[i].charAt(0));
        }
        System.out.println(lastList.toString().replace("[","").replace("]","").replace(",","").replace(" ",""));

    }
}
