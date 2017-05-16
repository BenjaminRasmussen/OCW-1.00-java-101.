package com.company2;

import java.util.NoSuchElementException;

/**
 * Created by Benjamin R. on 01-08-2016.
 */
public interface ListIterator {
    public boolean hasNext();
    public Object next()
            throws NoSuchElementException;
    public void remove()
            throws IllegalStateException;
    public void add( Object o );
    public void set( Object o )
            throws IllegalStateException;
}
