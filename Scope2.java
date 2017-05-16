package com.company;

/**
 * Created by Benjamin R. on 18-07-2016.
 */
public class Scope2 {
    static int i6;

    public static void main(String[] args){

    }
    public static void test2(){
        int i = 4;
        if(i*i > 6){
            int i6= i;
        }
        int i7 = i6 + 2;
    }
}
