package com.company;

/**
 * Created by Benjamin R. on 20-07-2016.
 */
public class River {
    String name;	// Package access
    double length;	// Package access
    Lake source;	// Package access
    public River(String n, double l, Lake s) {
        name= n;
        length= l;
        source= s;
    }

    public double getSourceLakeSize() {
        return source.area;		// River can see Lake data
    }
}
