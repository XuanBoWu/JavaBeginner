package com.wxb.beginner.chapter15.generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author alex
 * @version 1.0
 */
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        set.add(new Student("alex", 12));
        set.add(new Student("alice", 11));
        set.add(new Student("bob", 10));

        for (Student student : set) {
            System.out.println(student);
        }

        HashMap<String, Student> map = new HashMap<>();
        map.put("jack", new Student("jack", 23));
        map.put("milan", new Student("milan", 23));
        map.put("mike", new Student("mike", 23));

        for (Map.Entry<String, Student> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}