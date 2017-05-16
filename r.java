package com.company2;

/**
 * Created by Benjamin R. on 08-08-2016.
 */
public class r {
    private static r ourInstance = new r();

    public static r getInstance() {
        return ourInstance;
    }

    private r() {
    }
}
