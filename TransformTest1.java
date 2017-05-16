package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class TransformTest1 {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Rectangle transform");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,100);
        Container contentPane= frame.getContentPane();
        TransformPanel1 panel = new TransformPanel1();
        contentPane.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
