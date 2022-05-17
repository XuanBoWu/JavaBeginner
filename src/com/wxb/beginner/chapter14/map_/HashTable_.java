package com.wxb.beginner.chapter14.map_;

import java.util.Hashtable;

/**
 * @author alex
 * @version 1.0
 */
public class HashTable_ {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();

        hashtable.put("1", "A");
        hashtable.put("2", "B");
        hashtable.put("3", "C");
        hashtable.put("4", "D");
        hashtable.put("5", "E");

        System.out.println(hashtable);
    }
}
