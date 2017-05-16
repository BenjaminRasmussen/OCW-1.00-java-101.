package com.company2;

import java.util.EmptyStackException;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public interface Stack {
    public boolean isEmpty();
    public void push(Object o);
    public Object pop() throws EmptyStackException;
    public void clear();
}
