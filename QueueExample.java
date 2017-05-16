package com.company2;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public class QueueExample {
    public static void main(String args[]) {
        int[] array = { 12, 13, 14, 15, 16, 17 };
        Queue queue = new RinqQueue();
        for (int i = 0; i < array.length; i++) {
            Integer y= new Integer(array[i]);
            queue.add(y);
        }
        while (!queue.isEmpty()) {
            Integer z= (Integer) queue.remove();
            System.out.println(z);
        }
    }
}
