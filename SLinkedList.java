package com.company2;

/**
 * Created by Benjamin R. on 01-08-2016.
 */
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SLinkedList implements List {
    private int length = 0;
    /*private*/ Node first = null;  	// left package protected for visualization
    /*private*/ Node last = null;   	// left package protected for visualization

    /*private */ static class Node {	// left package protected for visualization
        Object item;
        Node next;

        Node( Object o, Node n )
        { item = o; next = n; }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return( first == null );
    }

    public boolean contains(Object o) {
        boolean found= false;
        if (first == null)
            return false;
        Node t= first;
        while (t != null) {
            if (t.item.equals(o)) {
                found= true;
                break;
            }
            t= t.next;
        }
        return found;
    }

    public void clear() {
        first = last = null;
        length = 0;
    }

    public Object removeFirst() throws NoSuchElementException {
        if ( first == null )        // if list is empty
            throw new NoSuchElementException();
        else {
            Node t = first;
            first = first.next;
            if ( first == null )    // if list had 1 element and is now empty
                last = null;
            length--;
            return t.item;
        }
    }

    public boolean remove(Object o) throws NoSuchElementException {
        if (first == null)		// Empty list
            throw new NoSuchElementException();
        if (first == last) 		// If only one item in list
            if (first.item.equals(o)) {
                removeFirst();
                return true;
            } else
                return false;

        // There are at least two items in the list if we're here
        if (last.item.equals(o)) {
            removeLast();
            return true;
        }
        if (first.item.equals(o)) {
            removeFirst();
            return true;
        }
        // There are at least two items in list, and neither first nor last will be removed
        // Thus, we don't have to update first or last pointers
        Node t= first.next;
        Node prev= first;
        while (t.next != null) {
            if (t.item.equals(o)) {
                prev.next= t.next;
                length--;
                return true;
            } else {
                prev= t;
                t= t.next;
            }
        }
        return false;
    }

    public void addFirst(Object o) {
        if ( first == null ) {  	// If the list is empty
            first = new Node( o , null);
            last = first;
        } else {
            first = new Node( o, first );
        }
        length++;
    }

    public void addLast(Object o) {
        if( first == null){ addFirst(o);} else{
            last.next = new Node(o, null);
            last = last.next;
            length++;}
        }


    @Override
    public void add(int n, Object o) {
        if (n == 0) {
            addFirst(o);
            return;
        }
        Node current = first;
        for (int i= 0; i < n-1; i++) {
            if (current == null)
                throw new IllegalArgumentException("add: list shorter than n-1");
            else
                current = current.next;
        }
        if (current == null)
            throw new IllegalArgumentException("add: list shorter than n-1*");
        else {
            Node prevCurrent= current;
            current.next= new Node( o, current.next);
            length++;
            if (prevCurrent == last)
                last= current.next;
        }
    }

    public Object removeLast() throws NoSuchElementException {
        if (first == null)
            throw new NoSuchElementException();
        else if (first == last) {       // 1 element in list
            Node t= first;
            first= last= null;
            length= 0;
            return t.item;  }
        else {
            Node t = first;
            for(int i = 0; i<length;i++){
               Node first = t.next;
                if(t.next==null){

                    last=null;
                    length--;
                }
            }
        }  return null;
        }


    public void print() {
        if(length<=0){System.out.println("List is empty");}else {
            Node t = first;
            ArrayList print = new ArrayList<>();
            for(int i = 0; i<length; i++){
                print.add(t.item);
                t = t.next;
            }
            System.out.println(print);
        }
    }

    public ListIterator listIterator()
    {
        return new SLinkedListIterator();
    }

    public class SLinkedListIterator implements ListIterator {
        private Node previous = null;  // points to the "previous" Node
        private Node current = null;   // points to the last link returned by
        // next() if it has not been removed
        private Node next;             // link to the item to be returned by
        // the next call to next()
        public SLinkedListIterator( ) {
            next = first;
            current=null;
        }

        public boolean hasNext() {
            return ( next != null );
        }

        public Object next() throws NoSuchElementException {
            if ( next == null )
                throw new NoSuchElementException();
            else {
                if ( current != null )
                    previous = current;
                current = next;
                next = next.next;
                return current.item;
            }
        }

        public void remove() throws IllegalStateException {
            if ( current == null )
                throw new IllegalStateException();
            if ( previous == null ) {    // if we are at start of list
                first = next;
                if ( first == null )    // if list had only one element
                    last = null;        //   it's now empty
            } else {                        // we are not at start of list
                previous.next = next;   // so make previous point to next
                if ( next == null )     // if we are removing last element
                    last = previous;
            }
            current = null;             // no current until next next()
            //  or add()
            length--;
        }

        // Insert after current but before next; becomes new current
        public void add(Object o) {
            // create a new link pointing to current's successor
            Node n = new Node( o, next );
            if ( current == null ) { // if we are inserting where there in no current
                if ( previous == null ){ // if we are at start of list
                    // new link's next already points to previous first element
                    first = n;
                    System.out.println("yes");
                } else                    // else we are at a deletion
                    // new link's next already points to link after deletion
                    previous.next = n;
            } else {    // normal insertion
                current.next = n;   // set current to point to new link
                previous=current;
            }
            current = n;            // So we can remove it

            // Check if we have inserted at end of list and must update last
            if ( n.next == null )
                last = n;
            length++;
        }

        public void set( Object o ) throws IllegalStateException {
            if ( current == null )
                throw new IllegalStateException();
            current.item = o;
        }
    }
}