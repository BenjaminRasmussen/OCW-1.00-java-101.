package com.company;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class Evaluate {
    private static MathFunction2 f;

    public static void main(String[] args) {
        eval(f, 2.0, 3.0);

    }

    public static boolean eval(MathFunction2 func, double d1, double d2) {
        if(d1+d2 >= 0){ return false;}
        return true;
    }
}
