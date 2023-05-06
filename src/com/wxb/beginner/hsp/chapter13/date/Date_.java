package com.wxb.beginner.hsp.chapter13.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author alex
 * @version 1.0
 */
public class Date_ {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E ");

        System.out.println(simpleDateFormat.format(date));


    }
}
