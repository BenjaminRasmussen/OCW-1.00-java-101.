package com.company;

/**
 * Created by Benjamin R. on 17-07-2016.
 */
public class InverseTest {

    static int loops;
    static double xStart = 0.0;
    static double xEnd = 2.0;
    static double deltax = 0.1;
    static double TOLERANCE = 1E-14;

    public static void main(String[] args) {

        for (double x = xStart; x < xEnd; x += deltax) {
            if (Math.abs(x - deltax * loops) < TOLERANCE) {
                break;
            } else {
                // System.out.println(x);
                loops++;
                System.out.println(loops);
                System.out.println(1 / (xEnd - x));

            }

        }

    }
}