package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public abstract class Vehicle {
    private static int nextID = 1;
    protected double mass;
    protected double maxSpeed;
    protected String name;
    private int ID;

    public Vehicle(double mass, double maxSpeed, String name) {
        ID++;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.name = name;
    }

    public abstract double getSafetyRating();

    public double getMaxEnergy() {
        return mass * maxSpeed;
    }

    public final int getID() {
        return this.ID;
    }
}
