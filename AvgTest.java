package com.company;

/**
 * Created by Benjamin R. on 18-07-2016.
 */
public class AvgTest {
    static double r1 = 10.0;
    static double r2 = 17.0;
    static double r3 = 55.0;
    static double r4 = 59.0;
    static double r5 = -3.0;
    static double r6 = 85.0;

    //Super robust construction. Array handleing is great in this class, save for later use.
    public static void main(String[] args) {
        double[] main1 = new double[]{r1, r2, r3};
        double[] main2 = new double[]{r4, r5, r6};
        System.out.println("Avg arrayMain1: " + average3(main1));
        System.out.println("Max arrayMain1: " + maximum3(main1));
        System.out.println("Avg arrayMain2: " + average3(main2));
        System.out.println("Max arrayMain2: " + maximum3(main2));
    }

    public static double average3(double[] main) {
        double sum = 0;
        for (int i = 0; i < main.length; i++) {
            sum = sum + main[i];
        }
        double average = sum / main.length;
        return average;
    }

    public static double maximum3(double[] main) {
        double max = 0;
        for (int i = 1; i < main.length; i++) {
            if (main[i] > max) {
                max = Math.abs(main[i]);
            }
        }
        return max;
    }
}

