package com.company2;

import java.util.TreeSet;

/**
 * Created by Benjamin R. on 02-08-2016.
 */
public class FullNameTest {
    public static void main(String[] args) {
        FullName scott= new FullName("Scott", "Stevens");
        FullName ellen= new FullName("Ellen", "Shipps");
        FullName andrea= new FullName("Andrea", "Kondoleon");
        FullName paul= new FullName("Paul", "Stevens");
        
        TreeSet<FullName> names= new TreeSet<FullName>();
        names.add(scott);
        names.add(ellen);
        names.add(andrea);
        names.add(paul);

        for (FullName f : names)
            System.out.println(f);
    }
}
