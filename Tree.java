package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Tree extends Plant {
    private String barkColor;
    private String leafType;
    public Tree(String ge, String sp, boolean iA, String bC, String lT){
        super(ge, sp, iA);
        iA = true;
        barkColor = bC;
        leafType = lT;
    }
}
