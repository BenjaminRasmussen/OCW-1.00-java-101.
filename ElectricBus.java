package com.company2;

/**
 * Created by Benjamin R. on 06-08-2016.
 */
public class ElectricBus extends Bus implements Electric {

    private double VOLTAGE;
    public ElectricBus(int capacity, double cost, double Voltage) {
        super(capacity, cost);

        this.VOLTAGE = Voltage;
    }

    @Override
    public double getVoltage() {
        return VOLTAGE;
    }

    @Override
    public double getAccel() {
        return 5.0;
    }
}
