package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public abstract class Bus {
    private int ID;
    private int capacity;
    private double cost;
    private static int nextID= 1;

    public Bus(int capacity, double cost) {
        ID= nextID++;
        this.capacity = capacity;
        this.cost = cost;
    }

    abstract public double getAccel();
    public final int getID() {return ID;}
    public int getCapacity() {return capacity;}
    public double getCost() {return cost;}
}
