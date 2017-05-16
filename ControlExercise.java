package com.company;

/**
 * Created by Benjamin R. on 17-07-2016.
 */

public class ControlExercise {
    static int i;
    static double j;
    static double s;

    public static void main(String[] args) {


        for (int i = 0; i < 9; i++) {
            double j = (i * i) - 5;
            if (j < 0) {
                continue;
            } else {
                s = Math.sqrt(j);
                System.out.println("i: " + i + "j: " + j + "s: " + s);
                if (s > 4) {
                    continue;
                } else {
                    System.out.println("Control");

                }
            }
        }
    }
}
