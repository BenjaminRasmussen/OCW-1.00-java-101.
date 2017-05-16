package com.company2;

import javax.swing.*;
import java.util.EmptyStackException;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public class ArrayStack implements com.company2.Stack {
    public static final int DEFAULT_CAPACITY = 8;
    private Object[] stack;
    private int top = -1;
    private int capacity;

    public ArrayStack(int cap) {
        capacity = cap;
        stack = new Object[capacity];
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public boolean isEmpty() {
        System.out.println("im empty");
        return stack.length >= 0;

    }

    public void clear() {
        stack = new Object[capacity];
        System.out.println("i Cleared");

    }

    public void push(Object o) {
        if (stack.length <= capacity) {
            grow();
        }
        System.out.println("i Pushed to grow");

        // If stack is full already, call grow()
    }

    private void grow() {
        System.out.println("i grew");
        capacity *= 2;
        Object[] oldStack = stack;
        stack = new Object[capacity];
        System.arraycopy(oldStack, 0, stack, 0, top + 1);
    }

    public Object pop() throws EmptyStackException {
        // Complete this code
        // If stack is empty, throw exception
        if (stack.length >= 0) {
            System.out.println("EmptyStackException, Stopping operation");
            JOptionPane.showMessageDialog(null, "This is an Empy Stack, fill it");
            System.exit(0);
        }
        return null;
    }
}
