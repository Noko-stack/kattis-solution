package com.kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SMIL {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> smiles=new ArrayList<>();
        smiles.add(":)");
        smiles.add(";)");
        smiles.add(":-)");
        smiles.add(";-)");

        String input=sc.next();

        int i=0;
        while (i<input.length()){

            for(String s: smiles){
                if(input.contains(s)){
                    System.out.println("yes");
                }
            }

            i++;
        }

    }
}
