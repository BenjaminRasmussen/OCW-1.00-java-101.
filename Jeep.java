package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class Jeep extends Vehicle {
    private double maxGrade = (0.2);
    public Jeep(double mass, double maxSpeed, String name) {
        super(mass, maxSpeed, name);
    }

    @Override
    public double getSafetyRating() {
       return Math.max(0, (100- 100*maxGrade-(0.5*maxSpeed)));
    }
    @Override
    public double getMaxEnergy() {
        return 0.5*mass*(maxSpeed*maxSpeed)+(9.8*maxGrade*getSafetyRating());
    }
    public static void main(String[] args){
        Jeep speed2 = new Jeep(2000, 30, "Speedster2");
        System.out.println(" " + speed2.getSafetyRating());
        System.out.println(" " + speed2.getMaxEnergy());
        System.out.println(" " + speed2.getID());
    }
}
