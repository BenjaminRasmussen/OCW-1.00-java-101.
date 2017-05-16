package com.company2;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public class Reverse {
    public static void main(String args[]) {
        int[] array = { 12, 13, 14, 15, 16, 17 };
        Stack stack = new ArrayStack();
        for (int i = 0; i < array.length; i++) {
            Integer y= new Integer(array[i]);
            stack.push(y);
        }
        while (!stack.isEmpty()) {

            Integer z= (Integer) stack.pop();
            System.out.println(z);
        }
    }
}
