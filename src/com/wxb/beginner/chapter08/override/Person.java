package com.wxb.beginner.chapter08.override;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("名字=" + name + " 年龄=" + age);
    }
}
