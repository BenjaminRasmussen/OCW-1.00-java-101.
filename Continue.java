package com.company;

/**
 * Created by Benjamin R. on 17-07-2016.
 */
public class Continue {
    public static void main(String [] args){
        for(int i = 0; i < 6 ; i++){
            if(i < 4){continue;}
            System.out.println("i: " + i) ;
            System.out.println("Done");
        }

    }
}
