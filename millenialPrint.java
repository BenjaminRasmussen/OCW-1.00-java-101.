package com.company;

import java.util.ArrayList;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
public class millenialPrint {
    public static void main(String[]args){
        int CurrentYear = 2016;
        ArrayList<Object> Millenial = new ArrayList<Object>();
        for(int i = 0; i < 985; i++){
            Millenial.add("The year: " + CurrentYear++);
        }
        System.out.println( Millenial);
    }
}
