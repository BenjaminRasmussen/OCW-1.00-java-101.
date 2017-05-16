package com.company;

/**
 * Created by Benjamin R. on 19-07-2016.
 */
public class Tank {
    // Data members-private. These are outside any method

    //This is so all methods can access the Tank Methods inputs.
    private double radius;
    private double length;
    private double thickness;
    private double price1 = 30.0;
    private double price2 = 48000.0;

    public Tank(double r, double len, double t) {
        radius = r;
        length = len;
        thickness = t;
    }

    //Cylinder wall mass = Lπ((R+t)^2 – R^2)
    public double getMassCylinderWalls() {
        double mass = length * Math.PI *
                ((radius + thickness) * (radius + thickness) - radius * radius);
        return mass;
    }

    //Cylinder end mass= 2πt(R+t)^2
    public double getMassEnds() {
        double mass = 2.0 * Math.PI * thickness *
                (radius + thickness) * (radius + thickness);
        return mass;
    }

    public double getMass() {
        return getMassCylinderWalls() + getMassEnds();
    }

    public double getVolume() {
        double Volume = Math.PI * (radius * radius) * length;
        return Volume;
    }

    public double getWeldLength() {
        double W = 8 * Math.PI * (radius + (thickness / 2));
        return W;
    }

    public double getTankCost(double c1, double c2) {
        double i = c1 * price1 + c2 * price2;
        return i;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setThickness(double t) {
        thickness = t;
    }

    public void setPrice1(double p) {
        price1 = p;
    }

    public void setPrice2(double p) {
        price2 = p;
    }
}
