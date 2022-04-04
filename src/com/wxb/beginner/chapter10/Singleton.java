package com.wxb.beginner.chapter10;

public class Singleton {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();//只能有一个cat实例
        Dog dog = Dog.getDog();//只能有一个dog实例


    }
}

//饿汉式
class Cat {
    private String name;
    public static int num = 100;

    private static Cat cat = new Cat();

    private Cat() {
    }

    public static Cat getCat() {
        return cat;
    }
}

//懒汉式
class Dog {
    private String name;
    public static int num = 190;

    private static Dog dog;

    private Dog() {}

    public static Dog getDog() {
        return dog;
    }
}