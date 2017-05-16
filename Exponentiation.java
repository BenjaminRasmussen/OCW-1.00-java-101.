package com.company;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
public class Exponentiation {
static int loops;
    public static void main(String[] args) {
       // String input= JOptionPane.showInputDialog("Enter x");
        long x= 1;
       // input= JOptionPane.showInputDialog("Enter y");
        long y= 1000000000;
        long z= expResult(x, y);
        System.out.println(x + " to " + y + " power is: " + z);
        System.exit(0);
    }

    public static long expResult(long x, long y) {
      long result = 0;
        // Remove =0 if desired
        // Write code when y is small enough
        if(y == 1) return x; else
            if(y%2 == 0) {
                long term = expResult(x, (y / 2));
            result = term*term; // square(expresult(x, y/2)
        }
        else result = x*expResult(x, y-1); // Multiply the recursion by x and subtract a exponent
        return result;

       //my attempt was really fucking close tho instead of x*expResult(x,y/2) it was squaring not multiply by iteself.

    }

}
