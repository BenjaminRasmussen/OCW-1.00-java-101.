package com.company;

/**
 * Created by Benjamin R. on 17-07-2016.
 */
public class MethodExercise {
    public static void main(String[] args) {
        //Declares string name, int age, double height
        //Sets variables to your name, age, height
        //Calls isOldEnough() method
        //Prints out whether old enough (true or false)
        //Calls printinfo() method
        // Method isOldEnough returns true if age >= 21, false otherwise
        //Method printinfo() prints name, age, height
        //choose appropriate arguments and return values.
        String name = "Benjamin";
        int age = 17;
        double height = 181;
        double weight = 71.3;
        // System.out.println("Your BMI is: " + getBmi(weight, height));
        System.out.println("Is old enough: " + isOldEnough(age));
        MethodExercise.printInfo(name, age, height, weight);
    }

    public static boolean isOldEnough(int a) {
        if (a >= 21) {
            return true;
        } else {
            return false;
        }
    }

    public static void printInfo(String n, int a, double h, double weight) {
        double bmi = getBmi(weight, h);
        System.out.println("Height: " + n + ". Age: " + a + ". Height: " + h + ". Bmi: " + bmi);
    }

    public static double getBmi(double weight, double height) {
        double result = 703 * weight / (height * height);
        return result;
    }
}


