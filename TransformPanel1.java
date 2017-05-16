package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class TransformPanel1 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 50, 100);

        g2.setPaint(Color.RED);
        Matrix s = new Matrix(3, 3);
        s.setElement(1, 1, 2);
        s.setElement(0, 0, 2);
        s.print();

        Matrix r = new Matrix(3, 3);        // Rotate
        double a = Math.PI / 10;            // 18 degree angle
        // Set its elements to rotate by 18 degrees; use Math.sin() and cos()
        r.setElement(0,0, Math.cos(a));
        r.setElement(0,1, -Math.sin(a));
        r.setElement(1,0, Math.sin(a));
        r.setElement(1,1, Math.cos(a));
        r.print();

        // Multiply r and s to get Matrix result

        Matrix result = new Matrix(3, 3);
        result = s.mult(r);
        result.print();

        double m00 = result.getElement(0, 0);
        double m01 = result.getElement(0, 1);
        double m02 = result.getElement(0, 2);
        double m10 = result.getElement(1, 0);
        double m11 = result.getElement(1, 1);
        double m12 = result.getElement(1, 2);
        // Coefficients inserted in COLUMN order. Done for you. Be careful.
        AffineTransform baseXf =
                new AffineTransform(m00, m10, m01, m11, m02, m12);
        g2.transform(baseXf);        // Only 6 elements vary in transform
        g2.draw(rect);
    }
}
