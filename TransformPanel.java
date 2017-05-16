package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class TransformPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        Rectangle2D rect= new Rectangle2D.Double(0, 0, 50, 100);
        g2.setPaint(Color.RED);
        g2.draw(rect);
        g2.setPaint(Color.BLUE);
        AffineTransform baseXf = new AffineTransform();
        baseXf.rotate(-Math.PI/6.0); // 3. Rotate 30° at origin
        baseXf.translate(50,200); // 2. Move 50, 200 pixels
        baseXf.scale(1.5, 1.5); // 1. Do scaling at origin
        g2.transform(baseXf);
        g2.draw(rect);
    }
}