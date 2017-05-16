package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Flower extends Plant {
    private String petalColor;
    public Flower(String ge, String sp, boolean iA, String Pc) {
        super(ge, sp, iA);
        petalColor = Pc;
    }
}
