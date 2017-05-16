package com.company2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public class DequeExample {
    public static void main(String[] args) {
        // Stack: use only push and pop
        Deque<String> stack= new ArrayDeque<String>();
        stack.push("Al");
        stack.push("Bob");
        stack.push("Claire");
        stack.push("Deb");
        System.out.println("Stack:");
        while (!stack.isEmpty())
            System.out.println(stack.pop());

        // Queue: use only addLast and removeFirst
        Deque<String> queue= new ArrayDeque<String>();
        queue.addLast("Al");
        queue.addLast("Bob");
        queue.addLast("Claire");
        queue.addLast("Deb");
        System.out.println("\nQueue:");
        while (!queue.isEmpty())
            System.out.println(queue.removeFirst());
    }
}