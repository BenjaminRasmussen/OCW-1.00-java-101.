package com.company2;

import java.util.NoSuchElementException;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public interface Queue {
    public boolean isEmpty();
    public void add(Object o);
    public Object remove() throws NoSuchElementException;
    public void clear();
}
