package com.company;

/**
 * Created by Benjamin R. on 20-07-2016.
 */
public class MapTest {

    public static void main(String[] args) {
        Mountain w= new Mountain("Washington", 6288);
        Mountain j= new Mountain("Jefferson", 5791);

        System.out.println(w.name /* w.elavation*/);
        // 	2. Try to print out Mt Washington elevation, name
        //	Leave in what compiles, comment out what doesn�t
        //  Name compiles, elavation is private so it dosent

        //  Uncomment next two lines after you've written the import statement
        	Lake winni=new Lake("Winnipesaukee", 44586);	// Acres
        	River m= new River("Merrimack", 120, winni);
            System.out.println(winni.area);
        //	3. Try to print size of Lake Winnipesaukee
            System.out.println(m.getSourceLakeSize());
        //	4. Is there another way to get the size?  Try it.
    }
}
