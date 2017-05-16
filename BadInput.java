package com.company;

import javax.swing.*;

/**
 * Created by Benjamin R. on 29-07-2016.
 */
public class BadInput {
    public static void main(String[] args) {
        while (true) {
            String answer =
                    JOptionPane.showInputDialog("Enter an integer (0 to quit)");
            int intAnswer = -1; 						// Must declare intAnswer outside try block (scope)
            try {										// Try block
                intAnswer = Integer.parseInt(answer);	// Throw exception if can't parse answer
                System.out.println(intAnswer);       	// Regular flow
            } catch (NumberFormatException e) {			// Catch block
                JOptionPane.showMessageDialog(null, "Not an integer");
            }
            if (intAnswer == 0)
                break;
        }
        System.exit(0);
    }
}
