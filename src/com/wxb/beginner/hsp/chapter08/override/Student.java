package com.wxb.beginner.hsp.chapter08.override;

public class Student extends Person {
    private int id;
    private double score;

    public Student() {
    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public void say() {
        super.say();
        System.out.println("学号=" + id + " 成绩=" + score);
    }
}
