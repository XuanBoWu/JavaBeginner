package com.wxb.beginner.hsp.chapter14.Collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alex
 * @version 1.0
 */
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Alex");
        list.add(100);
        list.add(true);

        System.out.println(list);
        list.remove("Alex");
        System.out.println(list);
        System.out.println(list.contains(100));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list);
        ArrayList list2 = new ArrayList();
        list2.add("水浒传");
        list2.add("红楼梦");
        list2.add("西游记");
        list.addAll(list2);
        System.out.println(list);

    }
}
