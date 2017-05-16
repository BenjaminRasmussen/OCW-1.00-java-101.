package com.company2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class ExamTestArrayList {
    public static void main(String[] args) {
        ArrayList<Exam> list= new ArrayList<Exam>();
        list.add(new Exam("1.00", new GregorianCalendar(2011,4,12), 22));

        list.add(new Exam("8.03", new GregorianCalendar(2011,4,14), 18));
        list.add(new Exam("16.04", new GregorianCalendar(2011,4,14), 23));
        list.add(new Exam("18.10", new GregorianCalendar(2011,4,14), 21));
        list.add(new Exam("2.60", new GregorianCalendar(2011,4,15), 17));
        System.out.println("Subject order");
        Collections.sort(list, new ExamComparatorSubject());
        for (Exam e: list)
            System.out.println(e);

        System.out.println("\nDate order");
        Collections.sort(list, new ExamComparatorDate());
        for (Exam e: list)
            System.out.println(e);

        System.out.println("\nRoom order");
        Collections.sort(list, new ExamComparatorRoom());
        for (Exam e: list)
            System.out.println(e);
    }
}
