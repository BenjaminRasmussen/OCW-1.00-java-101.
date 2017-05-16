package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Grad extends Student {
    private double gradSalary;

    public Grad(String f, String l, double sal) {
        super(f, l);
        gradSalary = sal;

    }
    public double getPay(){
        return gradSalary;
    }
    public void printData(){
        super.printData();
        System.out.println("Grad pay montly: " + getPay());
    }
}
