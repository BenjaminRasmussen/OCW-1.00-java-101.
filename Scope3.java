package com.company;

/**
 * Created by Benjamin R. on 18-07-2016.
 */
public class Scope3 {
    static int i;
    public static void main(String[] args) {
        test3();
    }

    public static void test3() {
        int i1;
        for (i1 = 0; i1 < 10; i1++) {
            System.out.println("d: " + getDensity(i1));
            int i2;
            for (i2 = 0; i2 < 10; i2++)
                System.out.println("c: " + getCube(i1));
        }
    }

    public static int getDensity(int i) {
        return i;
    }

    public static int getCube(int i) {
        return i * i;
    }
}

