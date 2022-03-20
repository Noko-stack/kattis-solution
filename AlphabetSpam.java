package com.kattis;

import java.util.Scanner;

public class AlphabetSpam {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input= sc.next();
        char[] word=input.toCharArray();


        float upper=0;
        float lower=0;
        float space=0;
        float special=0;

        float len=word.length;

        for(char i:word){
            if(Character.isUpperCase(i)){
                upper++;
            }else if(Character.isLowerCase(i)){
                lower++;
            }else  if(i=='_'){
                space++;
            }else {
                special++;
            }
        }
        float s=space/len;
        float l=lower/len;
        float u=upper/len;
        float spe=special/len;
        System.out.println(s);
        System.out.println(l);
        System.out.println(u);
        System.out.println(spe);

    }
}


