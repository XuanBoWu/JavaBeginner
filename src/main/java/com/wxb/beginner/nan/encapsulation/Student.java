package com.wxb.beginner.nan.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author alex
 * @version 1.0
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("编号输入错误");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        int len = name.length();
        String regEx = "^[\u4e00-\u9fa5]{2,10}$"; //中文简体
        Pattern pattern = Pattern.compile(regEx);
        Matcher m = pattern.matcher(name);
        if (len <= 10 && len >= 2 && m.matches()) {
            this.name = name;
        } else {
            System.out.println("姓名输入错误");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 60) {
            this.age = age;
        } else {
            System.out.println("年龄输入错误");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student(1, "alex", 12);
        System.out.println(student.toString());

    }
}
