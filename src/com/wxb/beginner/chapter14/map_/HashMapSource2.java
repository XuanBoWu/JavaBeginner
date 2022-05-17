package com.wxb.beginner.chapter14.map_;

import java.util.HashMap;

/**
 * @author alex
 * @version 1.0
 */
public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        for (int i = 1; i <= 12; i++) {
            map.put(new A(i), "hello");
        }
        System.out.println(map);
    }
}

class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}