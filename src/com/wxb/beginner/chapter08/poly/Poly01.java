package com.wxb.beginner.chapter08.poly;

/**
 * 这个程序演示不使用多态的情况下
 * @version 1.0 2022-03-07
 * @author alex
 */

public class Poly01 {
    public static void main(String[] args) {
        Master alex = new Master("Alex");
        Dog dog = new Dog("狗");
        Cat cat = new Cat("猫");
        Bone bone = new Bone("骨头");
        Fish fish = new Fish("鱼");

        alex.feed(dog, bone);
        alex.feed(cat, fish);
    }
}
