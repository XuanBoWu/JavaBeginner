package com.wxb.beginner.hsp.chapter14.list_;

import java.util.ArrayList;

/**
 * @author alex
 * @version 1.0
 */
public class ListExercise {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("123");

        for (Object o :list) {
            System.out.println(o.toString());
        }
        System.out.println("==========================");

        list.add(2, "Alex");
        System.out.println("Get：" + list.get(4));
        list.remove(5);
        list.set(6, "abc");
        for (Object o :list) {
            System.out.println(o.toString());
        }

    }
}
