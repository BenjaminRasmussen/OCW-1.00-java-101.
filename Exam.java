package com.company2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Benjamin R. on 30-07-2016.
 */
public class Exam {
    private String subject;
    private GregorianCalendar date;
    private int room;

    public Exam(String subject, GregorianCalendar date, int room) {
        this.subject = subject;
        this.date = date;
        this.room = room;
    }

    public String toString() {
        return ("Subject: "+ subject + " date: " +
                (date.get(Calendar.MONTH)+1) + "/" +
                date.get(Calendar.DAY_OF_MONTH) + "/" +
                date.get(Calendar.YEAR) + " room: " + room);
    }

    public String getSubject() {
        return subject;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public int getRoom() {
        return room;
    }
}
