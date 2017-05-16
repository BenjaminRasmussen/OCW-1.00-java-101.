package com.company;

/**
 * Created by Benjamin R. on 19-07-2016.
 */
public class AssemblyPlant {
    PlantA plantA;
    PlantB plantB;
    //Data fields: what is made, what parts plants are used, cost
    private double cost;

    public double getAssembly() {
        return plantA.getVolume() + plantB.getVolume();
    }

    public double getCost() {
        return plantA.getCostA() + plantB.getCostB();
    }

    public String getProductName() {
        return plantA.getName() + plantB.getName();
    }
}
