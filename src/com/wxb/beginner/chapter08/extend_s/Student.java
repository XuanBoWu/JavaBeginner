package com.wxb.beginner.chapter08.extend_s;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("学生名" + name + " 年龄" + age + " 成绩" + score);
    }
}
