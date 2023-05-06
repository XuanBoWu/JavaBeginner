package com.wxb.beginner.hsp.chapter08.exercise.homework13;

public class Student extends Person {
    private long stu_id;

    public Student(String name, String gender, int age, long stu_id) {
        super(name, gender, age);
        this.stu_id = stu_id;
    }

    @Override
    public String toString() {
        return "Student's info:\n"
                + super.toString()
                + "\nstu_id:" + stu_id
                + "\n" + test()
                + "\n" + play();
    }

    @Override
    public String play() {
        return super.play() + " likes playing football";
    }

    public String study() {
        return "I promise, I will study hard.";
    }

    public long getStu_id() {
        return stu_id;
    }

}
