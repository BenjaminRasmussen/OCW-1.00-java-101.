package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class CNGBus extends Bus implements LiquidFuel{
    private double range;
    private int EmissionTier;

    public CNGBus(int capacity, double cost, double range, int EmissionTier) {
        super(capacity, cost);
        this.range = range;
        this.EmissionTier = EmissionTier;
    }

    @Override
    public double getRange() {
        return range;
    }

    @Override
    public int getEmissionTier() {
        return EmissionTier;
    }

    @Override
    public double getAccel() {
        return 3.0;
    }
}
