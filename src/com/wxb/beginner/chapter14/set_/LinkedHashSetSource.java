package com.wxb.beginner.chapter14.set_;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author alex
 * @version 1.0
 */
public class LinkedHashSetSource {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("AAA"));
        set.add(123);
        set.add(123);
        set.add(new Customer("alex", 1001));
        set.add(456);
        set.add("ABC");

        System.out.println(set);
    }
}

class Customer {
    private String name;
    private int id;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

