package com.kattis;

public class searchingAlgorithm {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6, 8, 9};
        int x = 9;
        int lower = 0;
        int upper = numbers.length;
        int result = binarySearch.computeBinary(lower, upper, x, numbers);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
