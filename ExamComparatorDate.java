package com.company2;

import java.util.Comparator;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class ExamComparatorDate implements Comparator<Exam> {
    public int compare(Exam a, Exam b) {
        if (a.getDate().compareTo(b.getDate()) < 0)
            return -1;
        if (a.getDate().compareTo(b.getDate()) == 0)
            return 0;
        return 1;
    }
}

