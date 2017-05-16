package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class SpecialGrad extends Grad {
    private double specStiped;
    public SpecialGrad(String f, String l, double sal) {

        super(f, l, sal);
        specStiped = sal*2;
    }
    public double getPay(){
        return specStiped;
    }
    public void printData(){
        super.printData();
        System.out.println("Get Stiped: " + getPay());

    }
}
