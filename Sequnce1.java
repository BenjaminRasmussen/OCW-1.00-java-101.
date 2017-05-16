package com.company;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
import javax.swing.*;

public class Sequnce1 {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog("Enter n");
        int n= Integer.parseInt(input);
        for (int i= 0; i <= n; i++)
            System.out.println("i: "+ i + " q: " + q(i));
        System.exit(0);
    }

    public static double q(int n) {

        if (n<=0) return n; else
            return Math.pow((1+q(n-1)),1.0/3.0);

        // (q0 = 0)
        // (qn = (1 + q(n-1))^(1/3)) <-correct formula :D
    }
}