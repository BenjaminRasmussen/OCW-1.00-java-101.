package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class Hybrid extends Bus implements LiquidFuel, Electric {
    private double range;
    private int EmissionTier;
    private double VOLTAGE;
    public Hybrid(int capacity, double cost,double Voltage, double range, int EmissionTier) {
        super(capacity, cost);
        this.range = range;
        this.EmissionTier = EmissionTier;
        this.VOLTAGE = Voltage;
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
    public double getVoltage() {
        return VOLTAGE;
    }

    @Override
    public double getAccel() {
        return 4.0;
    }
}
