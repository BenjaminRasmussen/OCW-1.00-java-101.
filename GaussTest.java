package com.company;

import javax.swing.*;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class GaussTest {
    public static void main(String[] args) {
        int i, j;
        double term;
        String input = JOptionPane.showInputDialog("Enter number of unknowns");
        int n = Integer.parseInt(input);
        // Create matrices a, b6
        Matrix a = new Matrix(n, n);
        Matrix b = new Matrix(n, 1);
        // Enter matrix a
        for (i = 0; i < a.getNumRows(); i++)
            for (j = 0; j < a.getNumCols(); j++) {
                input =JOptionPane.showInputDialog("Enter a[" + i + "][" + j + "]");
                term = Double.parseDouble(input);
                a.setElement(i, j, term);
            }
        // Enter vector b as 1-column matrix
        for (i = 0; i < b.getNumRows(); i++) {
            input = JOptionPane.showInputDialog("Enter b[" + i + "]");
            term = Double.parseDouble(input);
            b.setElement(i, 0, term);
        }
        Matrix x= Matrix.gaussian(a, b);
        System.out.println("Matrix a:");
        a.print();
        System.out.println("Vector b:");
        b.print();
        System.out.println("Solution vector x:");
        x.print();
    }
}