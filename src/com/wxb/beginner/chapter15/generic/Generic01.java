package com.wxb.beginner.chapter15.generic;

import java.util.ArrayList;

/**
 * @author alex
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        //传统方法
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺柴",11));
        arrayList.add(new Dog("小黄",4));
        arrayList.add(new Dog("小黑",1));
        arrayList.add(new Cat("小白",1));
        for (Object o : arrayList) {
            Dog dog = (Dog) o;
            System.out.println(dog);
        }


    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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