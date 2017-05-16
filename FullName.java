package com.company2;

/**
 * Created by Benjamin R. on 02-08-2016.
 */
public class FullName implements Comparable<FullName> {
    private final String firstName;
    private final String lastName;

    public FullName( String f, String l ) {
        firstName= f;
        lastName= l;
    }

    public String getFirstName() {return firstName;}
    public String getLastName()  {return lastName;}

    public int compareTo( FullName fn ) {
        // Complete the  compareTo() method
        // Order by last name first
    int result = 0;

        if(lastName.length() < fn.lastName.length()) { result = -1;}
        if(lastName.length() > fn.lastName.length()) { result = 1; }
        if(lastName.length() == fn.lastName.length()) {
            if(firstName.length() < fn.firstName.length()){result = -1;} else
            if(firstName.length() > fn.firstName.length()){result = 1; }
            else result = 0;}
            return result;
    }



    public String toString() {
        return firstName + " " + lastName;
    }
}
