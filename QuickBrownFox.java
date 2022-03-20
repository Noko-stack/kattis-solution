package com.kattis;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuickBrownFox {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabet="abcdefghi";
        System.out.println("Enter a string value: ");
        String str = sc.nextLine().replace(" ","");
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

    }
}
