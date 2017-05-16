package com.company2;

import java.util.*;

/**
 * Created by Benjamin R. on 31-07-2016.
 */
public class RinqQueue implements Queue {
    static public final int DEFAULT_CAPACITY= 8;
    private Object[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int size = 0;

    public RinqQueue(int cap) {
        capacity = cap;
        front = 0;
        rear = capacity - 1;
        queue= new Object[capacity];
    }

    public RinqQueue() {
        this( DEFAULT_CAPACITY );
    }

    public void add(Object o) {
       queue[front] = o;
    }

    public Object remove() throws NoSuchElementException {
        if ( isEmpty() )
            throw new NoSuchElementException();
        else {
            return front = 0;
        }
    }

    public boolean isEmpty() {
        return queue.length == 0;
    }

    public void clear() {
        queue = new Object[0];
    }

    private void grow() {
        Object[] old= queue;
        int oldCapacity= capacity;
        capacity *= 2;
        queue= new Object[capacity];
        if ( size == 0 )
            return;
        if ( front <= rear ) {
            System.arraycopy(old, front, queue, 0, size );
        } else if ( rear < front ) {
            int nFront= oldCapacity-front;
            System.arraycopy(old, front, queue, 0, nFront);
            System.arraycopy(old, 0, queue, nFront, size-nFront );
        }
        front= 0;
        rear= size-1;
    }
}
