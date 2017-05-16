package com.company;

/**
 * Created by Benjamin R. on 19-07-2016.
 */
public class PlantB {

    private double height;
    private double length;
    private double thickness;
    private double cost = 50;
    private String name;

    public void PlantB(double h, double l, double t, String n) {
        height = h;
        length = l;
        thickness = t;
        name = n;
    }
    public void PlantB(double h, double l){
        height= h;
        length = l;
        thickness = 0.04;
    }

    public double getVolume() {
        return length * height * thickness;
    }

    public double getArea() {
        return length * height;
    }
    public double getCostB(){
        return getVolume()*cost;
    }
    public String getName(){
        return name;
    }

}

