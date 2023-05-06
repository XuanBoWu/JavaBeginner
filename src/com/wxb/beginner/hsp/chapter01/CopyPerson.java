package com.wxb.beginner.hsp.chapter01;

public class CopyPerson {
    public static void main(String[] args) {
        Person p = new Person(18, "Alex", "Engineer");

        Person p2 = new MyTools().CopyObject(p);
    }
}
class MyTools {
    public Person CopyObject(Person p) {
        Person p2 = new Person(p.age, p.name, p.job);
        return p2;
    }
}
class Person {
    int age;
    String name;
    String job;

    public Person(){}
    public Person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }
}
