package com.wxb.beginner.hsp.chapter01.homework;

/**
 * Homework12
 * 12. 创建一个Employee类，属性有(名字，性别，年龄，职位，薪水)，提供3个构造方法，
 * 可以初始化
 * (1)(名字，性别，年龄，职位，薪水)，
 * (2)(名字，性别，年龄)
 * (3) (职位，薪水)，
 * 要求充分复用构造器
 */
public class HomeWork12 {
    public static void main(String[] args) {

    }
}
class Employee {
    String name;
    String gender;
    int age;
    String position;
    double salary;

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }


    public Employee(String name, String gender, int age, String position, double salary) {
        this( name, gender, age); //复用构造器
        this.position = position;
        this.salary = salary;
    }

}
