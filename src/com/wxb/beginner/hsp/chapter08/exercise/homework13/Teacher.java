package com.wxb.beginner.hsp.chapter08.exercise.homework13;

public class Teacher extends Person {
    private int work_age;

    public Teacher(String name, String gender, int age, int work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }
    @Override
    public String toString() {
        return "Teacher's info:\n"
                + super.toString()
                + "\nwork_age:" + work_age
                + "\n" + teach()
                + "\n" + play();
    }
    @Override
    public String play() {
        return super.play() + " loves to play chinese chess";
    }

    public String teach() {
        return "I promise that I will teach well.";
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
