package com.company;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
public class MaxRecurse {
    public static void main(String[] args) {
        int[] a = {35, 74, 32, 92, 53, 28, 50, 62};
        System.out.println("Max: " + max(0, a.length-1, a));
    }

    public static int combine(int a, int b) {
        if (a >= b) return a;
        else return b;
    }

    public static int max(int i, int j, int[] arr) {
        if ((j - i) <= 1) { // Small enough
            if (arr[j] >= arr[i])
                return arr[j];
            else
                return arr[i];
        } else // Divide and combine
            return (combine(max(i, (i + j) / 2, arr),
                    max((i + j) / 2 + 1, j, arr)));
    }

}
