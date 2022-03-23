package com.wxb.beginner.chapter08.exercise;

public class Professor extends Teacher {
    private final double salaryLevel = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public String introduce() {
        System.out.println("教授的信息：");
        return super.introduce() + " salaryLevel=" + salaryLevel;
    }
}
