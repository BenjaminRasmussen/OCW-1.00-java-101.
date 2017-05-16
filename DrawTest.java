package com.company2;


import java.util.*;
import java.awt.Point;
import java.util.List;

/**
 * Created by Benjamin R. on 08-08-2016.
 */
public class DrawTest {

    public static void main(String[] args) {
        List<Point> Test1 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            int x1 = (int) Math.random() * 6;
            int y1 = (int) Math.random() * 6;
            Test1.add(new Point(x1, y1));
        }
    //    new DrawGraph(Test1);
    }
}
