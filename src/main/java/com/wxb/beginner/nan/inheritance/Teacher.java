package com.wxb.beginner.nan.inheritance;

/**
 * @author alex
 * @version 1.0
 */
public class Teacher extends Person{
    public Teacher(int id, String name, int age, char gender) {
        super(id, name, age, gender);
    }

    @Override
    public void show() {
        System.out.println("输出老师信息：");
    }
}
