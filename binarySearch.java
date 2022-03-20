package com.kattis;

class binarySearch {

    public static int computeBinary(int l, int h, int x, int[] numbers) {

        while (l < h) {

            int mid = (l + h) / 2;

            if (numbers[mid] == x) {
                return mid;
            }
            if (numbers[mid] > x) {
                return computeBinary(l, mid - 1, x, numbers);
            }
            return computeBinary(mid + 1, h, x, numbers);
        }
        return -1;
    }

}