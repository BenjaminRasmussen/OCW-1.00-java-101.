package com.company;

public class Pipe2 {
    private double radius;
    private double length;
    private Tank tank1;
    private Tank tank2;

    public Pipe2(double r, double len, Tank t1, Tank t2) {
        radius = r;
        length = len;
        tank1 = t1;
        tank2 = t2;
    }

    public double getSystemVolume() {
        return tank1.getVolume() + tank2.getVolume() +
                length * Math.PI * radius * radius;
    }
}