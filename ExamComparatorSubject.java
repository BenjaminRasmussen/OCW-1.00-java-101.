package com.company2;

import java.util.Comparator;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class ExamComparatorSubject implements Comparator<Exam> {
    public int compare(Exam a, Exam b) {
        double as = Double.parseDouble(a.getSubject());
        double bs = Double.parseDouble(b.getSubject());
        if(as<bs) return -1;
        if(bs<as) return 0;
        return 1;
    }
}
