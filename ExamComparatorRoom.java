package com.company2;

import java.util.Comparator;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class ExamComparatorRoom implements Comparator<Exam> {
    public int compare(Exam a, Exam b) {
        if (a.getRoom() < b.getRoom())
            return -1;
        if (a.getRoom() == b.getRoom())
            return 0;
        return 1;
    }
}
