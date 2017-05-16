package com.company;

import java.io.Serializable;

/**
 * Created by Benjamin R. on 29-07-2016.
 */
public class LightSensor extends SensorReading implements Serializable{
    private static final long serialVersionUID = 1L;
    private String ID;
    private int time;
    private double reading;
    private int light;

    public LightSensor() {}

    public LightSensor(String iD, int time, double reading, int light) {
        ID = iD;
        this.time = time;
        this.reading = reading;
        this.light = light;
    }

}
