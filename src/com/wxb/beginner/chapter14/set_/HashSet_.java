package com.wxb.beginner.chapter14.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author alex
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("1");
        System.out.println(hashSet);
    }
}
