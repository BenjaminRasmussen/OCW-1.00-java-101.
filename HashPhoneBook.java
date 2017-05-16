package com.company2;

import java.util.TreeMap;

/**
 * Created by Benjamin R. on 02-08-2016.
 */
public class HashPhoneBook {
    public static void main(String[] args) {
        FullName scott= new FullName("Scott", "Stevens");
        FullName ellen= new FullName("Ellen", "Shipps");
        FullName pizza= new FullName("Mystic", "Pizza");
        FullName paul= new FullName("Paul", "Stevens");
        TreeMap<FullName,String> phones= new TreeMap<FullName,String>();
        phones.put(scott, "617-225-7178");
        phones.put(ellen, "781-646-2880");
        phones.put(pizza, "781-648-2000");
        phones.put(paul, "617-498-2142");

        
        }
    }

