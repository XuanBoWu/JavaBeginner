package com.wxb.beginner.chapter14.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author alex
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("jack", 650);
        m.put("tom", 1200);
        m.put("smith", 2900);

        traverse(m);
        m.put("jack", 2600);
        traverse(m);

        for (Object o : m.keySet()) {
            m.put(o, (int)m.get(o) + 100);
        }
        traverse(m);


    }

    public static void traverse(Map map){
        Set key = map.keySet();

        for (Object o : key) {
            System.out.println(o + "-" + map.get(o));
        }
        System.out.println("=====================");
    }
}

