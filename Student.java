package com.company2;

/**
 * Created by Benjamin R. on 03-08-2016.
 */
public class Student {
    private String Firstname;
    private String Lastname;
    public Student(String f, String l){
        Firstname = f;
        Lastname = l;
    }
    public void printData() {
        System.out.println(Firstname + Lastname);
    }
}
