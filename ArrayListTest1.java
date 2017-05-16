package com.company;

import java.util.ArrayList;

/**
 * Created by Benjamin R. on 22-07-2016.
 */
public class ArrayListTest1 {
    public static void main(String[]args){
        ArrayList<String> myArrayList = new ArrayList<String>();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        myArrayList.add("Four");
        System.out.println(myArrayList);

        ArrayList<Integer> myIntList = new ArrayList<Integer>();
        myIntList.add(1);
        myIntList.add(3);
        myIntList.add(7);
        myIntList.add(2 , 5);
        System.out.println(myIntList);

    }
}
