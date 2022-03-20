package com.kattis;

import java.util.Scanner;

public class linearSearch {


    public static int LinearSearch(int n, int[] numbers, int x) {
        for (int i = 0; i < numbers.length; i++) {
            if (x == numbers[i])
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of elements in array");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Please enter the elements in array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Please enter the number to be searched!");
        int x = sc.nextInt();

        int result = linearSearch.LinearSearch(n, numbers, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}


