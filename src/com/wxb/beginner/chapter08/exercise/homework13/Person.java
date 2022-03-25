package com.wxb.beginner.chapter08.exercise.homework13;

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name
                + "\nage:" + age
                + "\ngender:" + gender;
    }

    public String test() {
        if (this instanceof Student) {
            return  ((Student) this).study();
        } else if (this instanceof  Teacher) {
            return ((Teacher) this).teach();
        } else {
            return "null";
        }
    }

    public String play() {
        return name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
