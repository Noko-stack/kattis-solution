package com.kattis;

import java.util.Scanner;

public class countthevowels {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String userInput=sc.nextLine();

        char[] vow={'A','E','I','O','U','a','e','i','o','u'};

        int count=0;
        for(int i=0;i<userInput.length();i++){

            char search=userInput.charAt(i);

            for(int j=0;j<vow.length;j++){

                if(search==vow[j]){
                    count+=1;
                }
            }

        }
        System.out.println(count);
    }
}
