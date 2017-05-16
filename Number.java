package com.company;

/**
 * Created by Benjamin R. on 20-07-2016.
 */
public class Number {
    private double base;

    public Number(double n) {
        base = n;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double i) {
        base = i;
    }

    public String toString() {
        return (" " + base);
    }
}
