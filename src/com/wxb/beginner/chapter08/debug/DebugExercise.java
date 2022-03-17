package com.wxb.beginner.chapter08.debug;

public class DebugExercise {
    public static void main(String[] args) {
        Person alex = new Person("Alex", 22);

        System.out.println(alex);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}