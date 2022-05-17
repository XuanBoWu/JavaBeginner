package com.wxb.beginner.chapter14.Collection_;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author alex
 * @version 1.0
 */
public class Collections_ {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("6");


        System.out.println(arrayList);

        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
    }
}
