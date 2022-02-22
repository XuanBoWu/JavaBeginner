package com.wxb.beginner.chapter08.extend_s;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        Graduate graduate = new Graduate();

        pupil.name = "小明";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(90);
        pupil.showInfo();

        graduate.name = "小军";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(60);
        graduate.showInfo();
    }
}
