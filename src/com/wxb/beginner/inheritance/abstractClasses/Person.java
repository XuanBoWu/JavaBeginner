package com.wxb.beginner.inheritance.abstractClasses;

/**
 * The book program list 5-5.
 * This an abstract class.
 * @version 1.0 2022-02-21
 * @author alex
 */
public abstract class Person {
    public abstract String getDescription(); //描述
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
