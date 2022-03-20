package com.kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lists = new ArrayList<>();
        String name = "HE GOT AWAY!";
        String result = "";

        for (int i = 1; i <= 5; i++) {

            String word = sc.next();
            if (word.contains("FBI")) {
                lists.add(i);
                result += word;
            }
        }

        if (result.contains("FBI")) {

            System.out.println(lists.toString().replace("[", "").replace("]", "").replace(",", ""));
        } else {
            System.out.println(name);
        }


    }
}
