package com.company;

import java.util.ArrayList;

/**
 * Created by Benjamin R. on 23-07-2016.
 */
//Completed task to 100% first try, no problem :D
public class ArrayExercise1 {
    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        Students.add("Amy");
        Students.add("Bob");
        Students.add("Cindy");
        Students.add("David");

        printOutArrayList(Students);
    }

    public static void printOutArrayList(ArrayList a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("Size: " + a.size());
    }
}
