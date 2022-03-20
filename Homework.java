package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w=sc.next();
        String[] words = w.split(";");
        List<Integer> list=new ArrayList<>();

        int count=0;
        for(int i=0;i< words.length;i++){
            if(words[i].contains("-")){
                String[] s=words[i].split("-");
                int num1=Integer.parseInt(s[0]);
                int num2=Integer.parseInt(s[1]);
                int dif=(num2-num1)+1;
                count+=dif;
            }else {
                count++;
            }
        }
        System.out.println(count);
    }
}
