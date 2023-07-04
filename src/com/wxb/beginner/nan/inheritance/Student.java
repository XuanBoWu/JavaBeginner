package com.wxb.beginner.nan.inheritance;

/**
 * @author alex
 * @version 1.0
 */
public class Student extends Person {
    private double score; // 子类自己的属性

    public Student(int id, String name, int age, char gender) {
        super(id, name, age, gender);
    }

    public void show() {
        System.out.println("输出学生信息：");
    }



}
