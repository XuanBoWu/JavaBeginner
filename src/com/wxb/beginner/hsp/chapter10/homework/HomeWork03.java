package com.wxb.beginner.hsp.chapter10.homework;

/**
 * @author alex
 * @version 1.0
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();
    }
}

abstract class Animal {

    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("Cat shout");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("Dog shout");
    }
}