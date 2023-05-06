package com.wxb.beginner.hsp.chapter08.poly;

/**
 * 这个程序演示 不使用多态的情况 和 使用多态的情况 的对比
 * @version 1.0 2022-03-07
 * @author alex
 */

public class Poly01 {
    public static void main(String[] args) {
        Dog dog = new Dog("狗");
        Cat cat = new Cat("猫");
        Pig pig = new Pig("猪");
        Bone bone = new Bone("骨头");
        Fish fish = new Fish("鱼");
        Rice rice = new Rice("米饭");

        // 不使用多态的情况
        Master alex = new Master("Alex");

        alex.feed(dog, bone);
        alex.feed(cat, fish);

        System.out.println("==================================");

        // 使用多态的情况
        Master_Poly bob = new Master_Poly("Bob");

        bob.feed(dog, bone);
        bob.feed(cat, fish);
        bob.feed(pig, rice);



    }
}
