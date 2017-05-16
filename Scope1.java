package com.company;

/**
 * Created by Benjamin R. on 18-07-2016.
 */
public class Scope1 {
    static int i;

//Had to make the test method call the overarching int i instead of the local variable i. I so deleted the local i and had global i be overwritten by local i(c).
    public static void main(String[] args) {
        int j = Scope1.test1();
        System.out.print(j);
    }

    public static int test1() {
        for (int c = 0; c < 10; c++) {
            if (Math.sqrt(c) > 2.5) {
                i = c;
                break;
            }
        }
        return i;
    }
}

