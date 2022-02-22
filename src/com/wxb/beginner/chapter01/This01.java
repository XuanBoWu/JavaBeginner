package com.wxb.beginner.chapter01;

public class This01 {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", 3);
        dog.info();
    }

}

class Dog{
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info(){
        System.out.println(name + "\t" + age + "\t");
    }
}