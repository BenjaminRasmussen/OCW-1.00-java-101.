package com.company;

/**
 * Created by Benjamin R. on 22-07-2016.
 */
public class ArrayTest3 {

    public static void main(String[] args) {

        double[] Tempweekly = {70.0, 61.0, 64.0, 71.0, 66.0, 68.0, 62.0};

        for (int i = 0; i<Tempweekly.length; i++){
            System.out.println(Tempweekly[i]);
        }
        System.out.println("Weekly Average: " + FindAverageTemp(Tempweekly));

    }public static double FindAverageTemp(double[] a){
        double sum = 0;
        for (double d : a) {
            sum += d;
        }
        return  sum/a.length;

    }
}
