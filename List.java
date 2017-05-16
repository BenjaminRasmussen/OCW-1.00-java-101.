package com.company2;

import java.util.NoSuchElementException;

/**
 * Created by Benjamin R. on 01-08-2016.
 */
public interface List {
    public boolean isEmpty();
    public void addFirst( Object o );
    public void addLast( Object o );
    public void add(int n, Object o);
    public boolean contains(Object o);
    public Object removeLast() throws NoSuchElementException;
    public Object removeFirst() throws NoSuchElementException;
    public boolean remove(Object o);
    public void clear();
    public int size();
    public void print();
    public com.company2.ListIterator listIterator();
}
