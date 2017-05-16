package com.company;

import javax.swing.*;

/**
 * Created by Benjamin R. on 24-07-2016.
 */
public class Sequence3 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter n");
        int n = Integer.parseInt(input);
        System.out.println("i x y");
        for (int i = 1; i <= n; i++)
            System.out.println(i + " " + x(i) + " " + y(i));
        System.exit(0);
    }


    // Write your methods for x(i) and y(i) here
    public static int x(int i) {
        if(i <= 0)return 1; else
            return (x(i/2)+(y(i/3)));
    }

    public static int y(int i) {
        if(i <= 0) return 2; else
            return (x(i/3)*(y(i/2))+2);
    }
}
