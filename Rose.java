package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Rose extends Flower {
    private boolean isHybrid;
    public Rose(String ge, String sp, boolean iA, String Pc, boolean iH) {
        super(ge, sp, iA, Pc);
        iA = true;
        isHybrid = iH;

    }



}
