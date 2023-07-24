package com.wxb.beginner.hsp.chapter08.override;

public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("张三", 20);
        Student student = new Student("王五", 21, 001, 90);

        person.say();
        student.say();

    }
}
