package com.wxb.beginner.chapter08.extend_s;

public class Pupil extends Student{ //小学生
    public void testing() {
        System.out.println("小学生" + name + "在考试。。。。");
        showInfo();
        super.showInfo();
    }
}
