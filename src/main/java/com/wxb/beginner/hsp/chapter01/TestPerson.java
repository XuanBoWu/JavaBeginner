package com.wxb.beginner.hsp.chapter01;


/**
 * 定义Person类，里面有name、 age属性，并提供compareTo比较方法，
 * 用于判断是否和另一个人相等，提供测试类TestPerson用于测试，
 * 名字和年龄完全一样，就返回true，否则返回false
 *
 * @author alex
 */
public class TestPerson {
    public static void main(String[] args) {
        Person01 p1 = new Person01("wxb", 22);
        Person01 p2 = new Person01("wxb", 22);
        Person01 p3 = new Person01("wxb", 11);

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
    }
}

class Person01 {
    String name;
    int age;
    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compareTo(Person01 p) {
//        if (p.name.equals(this.name) && p.age == this.age){
//            return true;
//        } else {
//            return false;
//        }
        return p.name.equals(this.name) && p.age == this.age;
    }
}
