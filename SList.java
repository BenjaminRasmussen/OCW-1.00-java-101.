package com.company2;

/**
 * Created by Benjamin R. on 01-08-2016.
 */
public class SList {
    public static void main(String[] args){
        SLinkedList myList = new SLinkedList();
        myList.addFirst("a");
        myList.addFirst("b");
        myList.addFirst("c");
        myList.addLast(("f"));
        myList.removeLast();
        myList.print();


        if(myList.size()>=2){
            System.out.println("myList 2: " + myList.last.item);}
            else {
                System.out.print("No such thing exists");
        }
    }}

