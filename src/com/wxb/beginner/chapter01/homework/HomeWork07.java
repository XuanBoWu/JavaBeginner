package com.wxb.beginner.chapter01.homework;

/**
 * Homework07
 *7. 设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息。
 *   并创建对象，进行测试、【提示this。属性】
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Dog dog = new Dog("大黄", "黄色", 2);

        dog.show();
    }
}
class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("姓名：" + this.name);
        System.out.println("颜色：" + this.color);
        System.out.println("年龄：" + this.age);
    }
}
