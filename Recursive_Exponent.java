package com.company;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
public class Recursive_Exponent {
    static int x = 5;
    static int y = 9;
    static int unevenreductions = 0;
    public static void main(String[]args){

        getExponent(y);
        System.out.print(x + " " + y);

}

    public static int ReturnExponent(int y){
        if(y%2 >= 1) getExponent(y);
        else if(y/2 >= 1) return ReturnExponent(y/2);
        else
            return y; return y;
    }
    public static int getExponent(int p){

        y = p;
        return --y + ++unevenreductions + --p + ReturnExponent(p);
    }

}
