package com.wxb.beginner.chapter14.map_;

import java.util.*;

/**
 * @author alex
 * @version 1.0
 */
public class MapMethod {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put("123", "alex");
        map.put("124", "bob");
        map.put("125", "alic");
        map.put("126", "jack");
        map.put("127", "wxb");

        System.out.println(map);

        map.remove("123");
        System.out.println(map);
        Object val = map.get("125");
        System.out.println(val);

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        for (Object o : map.keySet()) {
            System.out.println(o + "-" + map.get(o));
        }

        System.out.println();

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next + "-" + map.get(next));
        }

        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        //EntrySet
        Set set = map.entrySet();
        for (Object entry : set) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }


    }
}
