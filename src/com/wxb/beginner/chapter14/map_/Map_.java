package com.wxb.beginner.chapter14.map_;

import java.util.HashMap;
import java.util.Map;

/**
 * @author alex
 * @version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        //实现类的特点
        Map map = new HashMap();
        map.put("alex", 11);
        map.put("Bob", 11);
        map.put("Alice", 11);
        System.out.println(map);
    }
}