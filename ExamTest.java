package com.company2;

import java.util.Arrays;
import java.util.GregorianCalendar;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class ExamTest {
    public static void main(String[] args) {
        Exam[] list= new Exam[3];
        list[0]= new Exam("1.00", new GregorianCalendar(2011,4,12), 22);
        list[1]= new Exam("8.03", new GregorianCalendar(2011,4,14), 18);
        list[2]= new Exam("2.60", new GregorianCalendar(2011,4,15), 17);
        System.out.println("Subject order");
        Arrays.sort(list, new ExamComparatorSubject());
        for (Exam e: list)
            System.out.println(e);

        System.out.println("\nDate order");
        Arrays.sort(list, new ExamComparatorDate());
        for (Exam e: list)
            System.out.println(e);

        System.out.println("\nRoom order");
        Arrays.sort(list, new ExamComparatorRoom());
        for (Exam e: list)
            System.out.println(e);
    }
}
