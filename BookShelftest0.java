package com.company;

/**
 * Created by dumst on 17-07-2016.
 */
public class BookShelftest0 {
    public static void main(String[] args) {
        double lengthLeft = 1.0;    // Remaining space on bookshelf
        int booksPlaced = 0;        // Books on shelf so far
        float length = 0.4F;        // Length of book
        double TOLERANCE = 0.000000000000001;
        while (lengthLeft > 0) {
            if (Math.abs(lengthLeft - length) > TOLERANCE) {
                lengthLeft = lengthLeft - length;
                booksPlaced++;

            }
        }
        // Your code here: try to place items of length 0.1, 0.2,
        // 0.3, 0.4 and 0.5 on shelf. Loop while enough space
        // System.out.println(TOLERANCE);
        System.out.println("Books placed: " + booksPlaced);
        System.out.println("Length left: " + lengthLeft);
    }
}
// Revisit when you can solve the problem, Benjamin. R.
