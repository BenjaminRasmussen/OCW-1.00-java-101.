package com.company;

import javax.swing.*;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
public class Sequence2 {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog("Enter n");
        int n= Integer.parseInt(input);
        for (int i= 0; i <= n; i++)
            System.out.println("i: "+ i + " q: " + q(i));
        System.exit(0);
    }

    public static int q(int n) {
        double term = 0;
        if(n <= 0) return n; else
        if(n <= 1) return n-1; else
        if(n <= 2) return n-1; else
            return (q(n-3)+q(n-2));

        // correct code for equation:   q0 = 0
        //                              q1 = 0
        //                              q2 = 1
        //                              q(n) = q(n-3) + q(n-2) for n>= 3;


    }
}
