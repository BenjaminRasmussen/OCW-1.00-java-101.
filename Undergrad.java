package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Undergrad extends Student {
    private double Underwage;
    private double Underhours;
    public Undergrad(String f, String l, double w, double h) {
        super(f, l);
        Underwage = w;
        Underhours = h;
    }
    public double getPay(){
        return Underwage*Underhours;
    }
    public void printData(){
        super.printData();
        System.out.println("Pay - weekly: " + getPay());
    }
}
