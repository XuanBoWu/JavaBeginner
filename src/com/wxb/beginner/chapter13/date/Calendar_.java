package com.wxb.beginner.chapter13.date;

import java.util.Calendar;

/**
 * @author alex
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + 1);
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.YEAR));
    }
}
