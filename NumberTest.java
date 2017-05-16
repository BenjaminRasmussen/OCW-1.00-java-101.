package com.company;


/**
 * Created by Benjamin R. on 20-07-2016.
 */
public class NumberTest {

    public static void main(String[] args) {
        Number n = new Number(5.0);
        System.out.println("n main1: " + n);
        triple(n);
        System.out.println("n main2: " + n);
    }

    public static void triple(Number n) {
        System.out.println("n 1: " + n);
        n.setBase(n.getBase() * 3);
        System.out.println("n 2: " + n);
    }
    //What is the output?
    //main1 5.0
    //n1 5.0
    //n2 15.0
    //main2 5.0 <-- incorrect (15.0)
}
