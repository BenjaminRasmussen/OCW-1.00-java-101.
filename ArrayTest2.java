package com.company;

/**
 * Created by Benjamin R. on 22-07-2016.
 */
public class ArrayTest2 {
    public static void main(String[] args) {

        //int value dosent change because the scope of a primitive data type dosent go into methods
        //Array value does change since the object the array "arr" refers to is altered in the method and thus the reference is also altered. Scope dosent matter in this data type.
        int value = 10;
        int[] arr = {10, 11, 12, 13};
        System.out.println("value before: " + value);
        alterValue(value);
        System.out.println("value after: " + value);
        System.out.println("arr[0] before: " + arr[0]);
        alterArray( arr);
        System.out.println("arr[0] before: " + arr[0]);
}
public static void alterValue (int x) {
    x = 0;
}
public static void alterArray (int[] a){
    a[0] = 0;
}
}